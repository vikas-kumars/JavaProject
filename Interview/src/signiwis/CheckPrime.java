package signiwis;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=Integer.parseInt(s.nextLine());
		check(n);
	}

	private static void check(int n) {
		boolean b=true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println(n+" is not prime number");
				b=false;
				break;
			}
		}
		if(b==true) {
			System.out.println(n+" is prime number");
		}
		
	}

}
