package solution;

import java.util.Scanner;

public class DivisibleSumPair {
	public static void main(String[] args) {
		System.out.println("Enter the number of element in array: ");
		Scanner scr=new Scanner(System.in);
		int n=Integer.parseInt(scr.nextLine());
		System.out.println("Enter the number to be divided by pair of sum");
		int k=Integer.parseInt(scr.nextLine());
		System.out.println("Enter the element of array");
		int array[]=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=Integer.parseInt(scr.nextLine());			
		}
		int counter=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				int sum=array[i]+array[j];
				if(sum%k==0) {
					counter++;
				}

			}
		}
		System.out.println(counter);
		
	}

}
/*Output Format

Print the number of
pairs where and + is evenly divisible by

.

Sample Input

6 3
1 3 2 6 1 2

Sample Output

 5
*/
