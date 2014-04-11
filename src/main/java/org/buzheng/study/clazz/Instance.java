package org.buzheng.study.clazz;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Instance {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		// instanceof 比较一个对象是否某个类型（包括父类、接口）
		System.out.println(new HashMap() instanceof Map);
		System.out.println(new HashMap() instanceof HashMap);
		System.out.println(new HashMap() instanceof LinkedHashMap);
		System.out.println(new LinkedHashMap() instanceof HashMap);
		System.out.println(null instanceof Map);
		System.out.println((HashMap) null instanceof Map);
		
		System.out.println("------------------------");
		
		// isInstance 和 instanceof 一样，支持主角变成了 类
		System.out.println(Map.class.isInstance(new HashMap()));
		System.out.println(HashMap.class.isInstance(new HashMap()));
		System.out.println(LinkedHashMap.class.isInstance(new HashMap()));
		System.out.println(HashMap.class.isInstance(new LinkedHashMap()));
		System.out.println(Map.class.isInstance(null));
		System.out.println(Map.class.isInstance((HashMap)null));

		System.out.println("------------------------");

		System.out.println(HashMap.class.isAssignableFrom(Map.class));
		System.out.println(Map.class.isAssignableFrom(LinkedHashMap.class));

		
	}

}
