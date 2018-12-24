package java8Feature;

import org.apache.commons.lang3.StringUtils;

public class StringContainsOnlyNumberUsingCommons {

	public static void main(String[] args) {
		String str="12345";
		System.out.println(StringUtils.isNumeric(str));
	}

}
