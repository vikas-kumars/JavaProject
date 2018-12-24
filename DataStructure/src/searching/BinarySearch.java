package searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int first,last,middle;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the number of element in array");
		int n=Integer.parseInt(scr.nextLine());
		int array[] =new int[n];
		for(int i=0;i<n;i++) {
			array[i]=Integer.parseInt(scr.nextLine());
		}
		System.out.println("Enter the element ou want to search");
		int search=Integer.parseInt(scr.nextLine());
		int copyArray[]=new int[array.length];
		System.arraycopy(array, 0, copyArray, 0, array.length);
		Arrays.sort(array);
		first=0;
		last=array.length-1;
		middle=(first+last)/2;
		while(first<=last) {
			if(array[middle]<search) {
				first=middle+1;
				middle=(first+last)/2;
			}
			else if(array[middle]==search) {
				//System.out.println("Element found at position: "+middle);
				
				break;
			}
			else {
				last=middle-1;
				middle=(first+last)/2;
			}
			if(first>last) {
				System.out.println(first+" "+last);
				throw new IllegalStateException("Element not found");
			}
		}
		
	}
}
