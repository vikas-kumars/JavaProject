package signiwis;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of row and column");
		int r=s.nextInt();
		int c=s.nextInt();
		int matrix[][]=new int[r][c];
		System.out.println("enter the element");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				matrix[i][j]=s.nextInt();
			}
		}
		int transpose[][]=new int[c][r];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				transpose[i][j]=matrix[j][i];
				//transpose[j][i]=matrix[i][j];				
			}
		}
		System.out.println("Transpose the matrix:");
		for(int j=0;j<c;j++) {
			for(int i=0;i<r;i++) {
				System.out.print(transpose[j][i]+"\t");
			}
			System.out.println();
		}
		
	}

}
