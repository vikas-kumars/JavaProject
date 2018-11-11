package series;

import java.util.Scanner;

public class Series2 {

	public static void main(String[] args) {
		int x=0;
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.print(x+" ");	
		x=x+i;
		}

	}

}
