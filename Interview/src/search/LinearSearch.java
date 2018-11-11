package search;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int i;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number of element you want");
	int n=s.nextInt();
	int array[]=new int[n];
	System.out.println("enter the "+n+" element");
	for(i=0;i<n;i++) {
		array[i]=s.nextInt();
	}
	System.out.println("enter the element you want to find");
	int search=s.nextInt();
	for(i=0;i<n;i++) {
		if(array[i]==search) {
			System.out.println(+search+" element found at "+(i+1));
			break;
		}
	}
	if(i==n) {
		System.out.println(+search+ " element not present");
	}
	}

}
