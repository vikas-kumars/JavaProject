package signiwis;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int p=power(n);
		System.out.println("no of digit :"+p);
		int k=check(n,p);
		System.out.println(k);
		if(k==n) {
			System.out.println("is armstrong");
		}else {
			System.out.println("is not armstrong");
		}

	}

	

	private static int check(int n, int p) {
		int num=1,sum=0,r;
		while(n!=0) {
			r=n%10;
			for(int i=1;i<=p;i++) {
				num=num*r;
			}
			sum=sum+num;
			n=n/10;
			num=1;
		}
		return sum;		
	}



	private static int power(int n) {
		int count=0;
		while(n!=0) {
			//int r=n%10;
			n=n/10;
			count++;
		}
		return count;
	}

}
