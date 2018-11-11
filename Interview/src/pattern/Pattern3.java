package pattern;

import java.util.Scanner;

public class Pattern3 {
	public static void  printStar(int n) {
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
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
