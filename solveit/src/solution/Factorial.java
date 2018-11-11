package solution;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		int result=fact(n);
		System.out.println(result);
	}
	private static  int fact(int n) {
		if(n<=1) {
			return 1;
		}else {
			return (n*fact(n-1));
		}
	}

}
