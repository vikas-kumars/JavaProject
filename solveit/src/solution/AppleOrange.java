package solution;

import java.util.Arrays;
import java.util.Scanner;

public class AppleOrange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=Integer.parseInt(sc.nextLine());//starting point of house
		int t=Integer.parseInt(sc.nextLine());//end point of the house
		int a=Integer.parseInt(sc.nextLine());//point at which apple tree
		int b=Integer.parseInt(sc.nextLine());//point at which orange tree
		int m=Integer.parseInt(sc.nextLine());//no.of apple
		int n=Integer.parseInt(sc.nextLine());//no.of orange
		int da[]=new int[m];
		int dor[]=new int[n];
		int counta=0;
		int counto=0;
		for(int i=0;i<m;i++) {
			da[i]=Integer.parseInt(sc.nextLine());
			int sum=a+da[i];
			if(sum>=s && sum<=t) {
				counta++;
			}
		}
		for(int i=0;i<n;i++) {
			dor[i]=Integer.parseInt(sc.nextLine());
			int sum=b+dor[i];
			if(sum>=s && sum<=t) {
				counto++;
			}
		}
		System.out.println(counta);
		System.out.println(counto);
		
	}

}
