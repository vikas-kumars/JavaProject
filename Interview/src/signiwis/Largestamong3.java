package signiwis;

import java.util.Scanner;

public class Largestamong3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter three element");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println(+a+" is greatest among all");
			}else {
				System.out.println(+c+ " is greatest among all");
			}
		}else {
			if(b>c)
				System.out.println(+b+" is greatest among all");
			else
				System.out.println(+c+" is greatest among all");
		}
	}
}
