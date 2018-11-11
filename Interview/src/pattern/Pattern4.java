package pattern;

import java.util.Scanner;

public class Pattern4 {
	public static void  printStar(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n-1;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int b=s.nextInt();
		printStar(b);
				

	}

}
