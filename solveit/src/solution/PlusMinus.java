package solution;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []a=new int[n];
		float plus=0f,minus=0f,neutral=0f;
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			if(a[i]<0f) {
				minus++;
			}else if(a[i]>0f){
				plus++;
			}else {
				neutral++;
			}
		}
		System.out.format("%.6f",plus/n);
		System.out.println();
		System.out.format("%.6f",minus/n);
		System.out.println();
		System.out.format("%.6f",neutral/n);
	}

}
