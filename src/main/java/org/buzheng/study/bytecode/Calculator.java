package org.buzheng.study.bytecode;

import java.lang.reflect.Method;
import java.util.Arrays;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import org.buzheng.study.bytecode.CompilerTest.StringSourceJavaObject;

/**
 * 计算器
 * 
 * 根据表达式动态生成java源文件，编译并运行处结果
 *
 */
public class Calculator {

	private static double calculate(String expr) throws Exception {
		String className = "CalculatorMain";
		String methodName = "calculate";
		String source = "public class " + className
				+ " { public static double " + methodName + "() { return "
				+ expr + "; } }";

		// Java 编译器对象
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(
				null, null, null);

		// Java 源码 对象
		StringSourceJavaObject sourceObject = new CompilerTest.StringSourceJavaObject(
				className, source);
		Iterable<? extends JavaFileObject> fileObjects = Arrays
				.asList(sourceObject);

		// 指定输出目录
		String targetDir = "E:\\workspace\\buzheng-study-java\\target\\classes";
		Iterable<String> options = Arrays.asList("-d", targetDir);

		// 编译为字节码
		CompilationTask task = compiler.getTask(null, fileManager, null,
				options, null, fileObjects);

		boolean result = task.call();
		if (!result) {
			throw new Exception("编译失败");
		}

		System.out.println("编译成功");
		ClassLoader loader = Calculator.class.getClassLoader();
		try {
			Class<?> clazz = loader.loadClass(className);
			Method method = clazz.getMethod(methodName, new Class<?>[] {});
			Object value = method.invoke(null, new Object[] {});
			return (Double) value;
		} catch (Exception e) {
			throw new Exception("内部错误", e);
		}
	}

	public static void main(String[] args) throws Exception {
		String expression = "1 * 1 - 2";
		System.out.println(expression + " = " + calculate(expression));

		expression = "9 * 8 - 7 + 6 / 5 ";
		System.out.println(expression + " = " + calculate(expression));
	}

}
