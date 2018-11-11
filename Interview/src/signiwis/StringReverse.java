package signiwis;

import java.util.Scanner;

public class StringReverse {
	 String rev="";

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		StringReverse sr=new StringReverse();
		String s1=sr.reverse(str);
		System.out.println(s1);

	}

	private  String reverse(String str) {
		if(str.length()==1) {
			return str;
		}else {
		rev=str.charAt(str.length()-1)+reverse(str.substring(0, str.length()-1));
		return rev;
		}
		
	}

}
