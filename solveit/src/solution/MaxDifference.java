package solution;

import java.util.Scanner;

public class MaxDifference {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(sc.nextLine());
		}
		diff(arr);
	}

	private static void diff(int[] arr) {
		int maxdiff=arr[1]-arr[0];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]-arr[i]>maxdiff) {
					maxdiff=arr[j]-arr[i];
				}
			}
		}
		System.out.println(maxdiff);
	}

}
