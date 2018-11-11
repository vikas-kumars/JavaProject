package solution;

import java.util.Scanner;

public class CountDivisor {
	public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int r = sc.nextInt();
		int k = sc.nextInt();
		
		sc.close();
		int count = 0;
		if(l == r && l%k != 0) {
			System.out.println(0);
			System.exit(0);
		}
		
		while (l <= r) {
			if(l % k == 0) {
				break;
			}
			l++;
		}
 
		count = (r - l) / k + 1;
		System.out.println(count);
    }
}



/*public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int r=sc.nextInt();
		int k=sc.nextInt();
		int count=0;
		for(int i=l;i<=r;i++) {
			if(i%k==0)
				count++;
		}
		System.out.println(count);
	}
	
	}*/