package solution;

import java.util.Scanner;

public class ArraysCompare {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		int n=Integer.parseInt(scr.nextLine());
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[2*n];
		for(int i=0;i<n;i++) {
			a[i]=scr.nextInt();
		}
		for(int j=0;j<n;j++) {
			b[j]=scr.nextInt();
		}
		int k=0;
			for(int i=0;i<n;i++) {
				if(a[i]>b[i]) {
					c[k]=b[i];
				    c[k+1]=a[i];
				    k=k+2;
				}
				else {
					c[k]=a[i];
					c[k+1]=b[i];
					k=k+2;
				}
			}
			for(int i=0;i<2*n;i++) {
				System.out.print(c[i]+" ");
			}
		
	}
}
