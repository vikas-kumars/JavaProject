package solution;

import java.util.Scanner;

public class BirthdayCakeCandle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[n-1]==arr[i])
				count++;
		}
		System.out.println(count);
	}

}
