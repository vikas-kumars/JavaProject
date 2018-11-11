package numericalpattern;

import java.util.Scanner;

public class NPattern3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of row:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			int num=i;
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num=num+n-j;
			}
			System.out.println();
		}
	}

}
