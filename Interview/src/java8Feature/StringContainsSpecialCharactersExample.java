package java8Feature;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringContainsSpecialCharactersExample {

	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("[a-zA-Z0-9]*");
		String str="Abc@123";
		Matcher matcher=pattern.matcher(str);
		if(matcher.matches()) {
			System.out.println("String "+str+" does not contain speical character");
		}else {
			System.out.println("String "+str+" Contains special character");
		}
	}

}
