package java2nvoice;

import java.util.Scanner;

public class IsPerfectNumber {
	public boolean checkPerfectNumber(int number) {
		int temp=0;
		for(int i=1;i<=number/2;i++) {
			if(number%i==0) {
				temp+=i;
			}			
		}
		if(temp==number) {
			return true;
		}
		else
			return false;
		
	}
	 public static void main(String[] args) {		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=s.nextInt();
		IsPerfectNumber ipn=new IsPerfectNumber();
		System.out.println(number+" Is Perfect Numbere ="+ipn.checkPerfectNumber(number));
	}
}
