package pattern;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number of row");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
				System.out.print("*");
			System.out.println();
		}
		
	}

}
