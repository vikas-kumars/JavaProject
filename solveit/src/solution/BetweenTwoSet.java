package solution;

import java.util.Scanner;

public class BetweenTwoSet {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int array1Size=Integer.parseInt(scr.nextLine());
		int array2Size=Integer.parseInt(scr.nextLine());
		int[] a=new int[array1Size];
		int[] b=new int[array2Size];
		System.out.println("enter the first array element");
		for(int i=0;i<a.length;i++) {
			a[i]=Integer.parseInt(scr.nextLine());
		}
		for(int i=0;i<b.length;i++) {
			b[i]=Integer.parseInt(scr.nextLine());
		}
		int n=b[0]-a[0];
		int numb1[]=new int[n];
		int finalcounter=0;
		for(int i=a[0];i<=b[0];i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(i%a[j]==0) {	
					count++;
				}
			}
			if(count==a.length) {
				int counter=0;
				for(int k=0;k<b.length;k++) {
					if(b[k]%i==0) {
						counter++;
					}
				}
				if(counter==b.length) {
					//System.out.println();
					finalcounter++;
				}
			}
		}
		System.out.println(finalcounter);
	}

}


/*Sample Input

2 3
2 4
16 32 96

Sample Output

3

Explanation

2 and 4 divide evenly into 4, 8, 12 and 16.
4, 8 and 16 divide evenly into 16, 32, 96.

4, 8 and 16 are the only three numbers for which each element of a is a factor and each is a factor of all elements of b. 
*/