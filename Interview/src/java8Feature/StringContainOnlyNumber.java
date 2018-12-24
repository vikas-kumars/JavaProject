package java8Feature;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringContainOnlyNumber {

	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("\\d+");
		String str="12345";
		Matcher matcher=pattern.matcher(str);
		if(matcher.matches()) {
			System.out.println("String "+str+" contains only number");
		}else {
			System.out.println("String "+str+" contains other character to");
		}
	}

}
