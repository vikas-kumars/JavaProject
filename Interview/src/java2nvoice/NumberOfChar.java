package java2nvoice;

import java.util.Scanner;

public class NumberOfChar {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		String str=scr.nextLine();
		int originallen=str.length();
		String ch=scr.nextLine();
		str=str.replace(ch, "");
		int replacelLen=str.length();
		int totalchar=originallen-replacelLen;
		System.out.println(totalchar);
	}

}
