import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) throws Exception {
		String value = "<a href=\"http://www.google.com\">谷歌</a><a href=\"http://www.baidu.com\">百度</a>";

		System.out.println("贪婪模式：");
		Pattern pattern = Pattern.compile("<a (.*)</a>");
		Matcher matcher = pattern.matcher(value);
		while (matcher.find()) {
			System.out.println(matcher.group(0));
		}

		System.out.println("贪婪模式：");
		pattern = Pattern.compile("<a (.*?)</a>");
		matcher = pattern.matcher(value);
		while (matcher.find()) {
			System.out.println(matcher.group(0));
		}
	}
}