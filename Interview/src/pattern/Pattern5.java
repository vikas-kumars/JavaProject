package pattern;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] agrs) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numer of row");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}			
			for(int k=1;k<=(i*2)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
