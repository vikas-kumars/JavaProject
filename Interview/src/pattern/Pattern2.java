package pattern;

import java.util.Scanner;

public class Pattern2 {

	public static void  printStar(int n) {
		/*int i,j,k=2*n-2;
		for(i=0;i<n;i++) {
			for(j=0;j<k;j++) {
				System.out.print(" ");
			}
			k=k-2;
			for(j=0;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}*/
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
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
