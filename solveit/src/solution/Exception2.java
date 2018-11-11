package solution;

import java.util.Scanner;
class Calculator{

	public int power(int n, int p)throws Exception {
		if(n<0 || p<0) {
			throw new Exception("n and p should be non-negative");
			
		}
		return (int)Math.pow(n, p);
	}
	
}

public class Exception2 {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		int t=scr.nextInt();
		while(t--> 0) {
			int n=scr.nextInt();
			int p=scr.nextInt();
			Calculator calc=new Calculator();
			try {
				int ans=calc.power(n,p);
				System.out.println(ans);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
