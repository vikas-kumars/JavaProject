package pattern;

import java.util.Scanner;

public class Pattern1 {
	public static void  printStar(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
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
