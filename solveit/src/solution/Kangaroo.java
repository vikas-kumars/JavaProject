package solution;

import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] str=sc.nextLine().split(" ");
		int x1=Integer.parseInt(str[0]);
		int v1=Integer.parseInt(str[1]);
		int x2=Integer.parseInt(str[2]);
		int v2=Integer.parseInt(str[3]);
		String result=jump(x1,v1,x2,v2);
		System.out.println(result);
		
	}

	private static String jump(int x1, int v1, int x2, int v2) {
		int sum1=0;
		int sum2=0;
		String s1="YES";
		String s2="NO";
		boolean b=false;
		for(int i=0;i<10000;i++) {
			if(i==0) {
				sum1=x1+v1;
				sum2=x2+v2;
				if(sum1==sum2) {
					b=true;
					break;
				}
			}
			else {
				sum1=sum1+v1;
				sum2=sum2+v2;
				if(sum1==sum2) {
					b=true;
					break;
				}
			}
		}
		if(b) {
			return s1;
		}else
			return s2;
	}

}
