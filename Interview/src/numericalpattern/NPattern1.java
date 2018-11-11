package numericalpattern;

import java.util.Scanner;

public class NPattern1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of row:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print("1");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
