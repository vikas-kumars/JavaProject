package solution;

import java.util.Scanner;

public class Diagonalsumdiff {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value for square matrix side");
		int n=s.nextInt();
		int ar[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				ar[i][j]=s.nextInt();
			}
		}
		int d1=0,d2=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					d1=d1+ar[i][j];
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j==(n-1)) {
					d2=d2+ar[i][j];
				}
			}
		}
		int total=d1-d2;
		System.out.println(Math.abs(total));
	}
}
