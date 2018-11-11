package solution;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSubString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int k=Integer.parseInt(sc.nextLine());
		int totalsubstring=(int)Math.ceil((double)str.length()/k);
		String[] st=new String[totalsubstring];
		int index=0;
		for(int i=0;i<str.length();i=i+k) {
			st[index++]=str.substring(i, Math.min(i+k, str.length()));
		}
		System.out.println(Arrays.toString(st));
	}
}
