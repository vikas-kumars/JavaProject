package signiwis;

import java.util.Scanner;

public class PrintPrime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("select the range of prime number");
		int n=Integer.parseInt(s.nextLine());
		print(n);
	}

	private static void print(int n) {
		for(int i=2;i<=n;i++) {
			boolean b=true;
			for(int j=2;j<i;j++) {
				if(j%i==0) {
					b=false;
					break;
				}
			}
			if(b) {
				System.out.print(i+" ");
			}
		}
	}

}
