package solution;

import java.util.Scanner;

public class BinaryConverter {

	/*public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		int n=Integer.parseInt(scr.nextLine());
		int q=n;
		int r[]=new int[n];
		for(int i=0;i<=q;i++) {
		      if(n>0) {
				r[i]=n%2;
				n=n/2;
			}
		}
		System.out.println(Arrays.toString(r));

	}
*/
	
	/*public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		int n=Integer.parseInt(scr.nextLine());
		int count=0;
		int numberof1=0;
		StringBuilder builder=new StringBuilder();
		while(n>0) {
			int r=n%2;
			//System.out.print(r+" ");
			
			builder.append(Integer.toString(r));
		//	System.out.print(builder.reverse().toString());
			if(r==1) {
				count++;
				if(count>numberof1) {
					numberof1=count;
				}
			}else {
				count=0;
			}
			n=n/2;
		}
		System.out.println(builder.reverse().toString());
		System.out.println();
		System.out.println(numberof1);
	}*/
	
	
	/*public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=Integer.parseInt(s.nextLine());
		String binary=toBinaryString(n);
		System.out.println("using Integer.toBinaryString(n) "+binary);
		 String bina=toString(n);
		 System.out.println("using Integer.toString(n,2) "+bina);
	}

	private static String toString(int n) {
		return Integer.toString(n,2);
	}

	private static String toBinaryString(int n) {
		
		return Integer.toBinaryString(n);
	}*/
	
	/*---------------Practicse----------------*/
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		int n=scr.nextInt();
		System.out.println(Integer.toBinaryString(n));

		int count=0,numOfOne=0;
		while(n>0) {
			int r=n%2;
			if(r==1) {
				count++;
				if(count>numOfOne) {
					numOfOne=count;
				}
			}else {
				count=0;
			}
			n=n/2;
		}
		System.out.println(numOfOne);
	}
}
