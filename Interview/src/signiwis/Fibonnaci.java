package signiwis;

import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
		int a=0,b=0,c=1,i=1;		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(i<=n) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" ");
			i++;
		}
	}

}
