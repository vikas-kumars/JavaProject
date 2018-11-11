package solution;

import java.util.Scanner;

public class Test {
	static int x=0;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		 arr=sort(arr);
		//print sorted array
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		int [][]b=new int[arr.length][2];
		b[x][0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1]) {
				b[x][1]=b[x][1]+1;
			}else {
				x++;
				b[x][0]=arr[i];
			}
		}
		x++;
		System.out.println();
		b=sort(b);
		for(int i=0;i<x;i++) {
			for(int j=0;j<=b[i][1];j++) {
				System.out.print(" "+b[i][0]);
			}
			//System.out.println();
		}
		
		
		
	}

	private static int[][] sort(int[][] b) {
		int c[]=new int[2];
		for(int i=0;i<x;i++) {
			for(int j=i;j<x;j++) {
				if(b[i][1]<b[j][1]) {
					c=b[i];
					b[i]=b[j];
					b[j]=c;
				}
			}
		}
		return b;
	}

	private static int[] sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
}