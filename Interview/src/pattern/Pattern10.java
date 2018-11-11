package pattern;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		int count=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of row");
		int number=s.nextInt();
		 for (int k = 1; k <= number; k++)
	        {
	            for (int i = 1; i <= count; i++)
	                System.out.print(" ");
	            count++;
	            for (int i = 1; i <= 2 * (number - k) - 1; i++)
	                System.out.print("*");
	            System.out.println();
	        }
	}
	}


