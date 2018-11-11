package solution;

import java.util.Scanner;

public class ArrayModulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] x=new int[n];
		long m = (long) (Math.pow(10.0, 9.0) + 7);
        long ans = 1;
        for (int i = 0; i < n; i++) {
			x[i]=s.nextInt();
			 ans = (ans *x[i]) % m;
			 
		}
		System.out.println(ans);
		//System.out.println(m);
		//System.out.println(ans*m);

	}

}
