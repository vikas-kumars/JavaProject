package pattern;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of row");
		int n=s.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1;i<=n-1;i++) {
			for(int j=1;j<=i+1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
