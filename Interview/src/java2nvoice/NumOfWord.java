package java2nvoice;

import java.util.Scanner;

public class NumOfWord {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		String str=scr.nextLine();
		str=str.trim();
		String[] st=str.split(" ");
		System.out.println("number of word "+st.length);
	}

}
