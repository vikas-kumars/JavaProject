package signiwis;

/*import java.util.Scanner;
public class Solution {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long sum=0;
        for(int i=0;i<ar.length;i++)
            sum=sum+ar[i];
        return sum;
    }

   
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	int n=s.nextInt();
    	long[] ar=new long[n];
    	String[] str=s.nextLine().split(" ");
    	for(int i=0;i<n;i++) {
    		//ar[i]=Long.parseLong(str[i]);
    		//ar[i]=l;
    		//System.out.println("hello");
    		//ar[i]=s.nextLong();
    		//ar[i]=Integer.parseInt(s.nextLine());
    		ar[i]=s.nextLong();
    	}
    	long value=aVeryBigSum(ar);
    	System.out.println(value);
    }
}
*/



import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
       // double d=sc.nextDouble()
        List<BigInteger> input = new ArrayList<>();
        sc.nextLine();
        BigInteger sum = BigInteger.ZERO;
        for(int i=0; i<n; i++){
            sum = sum.add(new BigInteger(sc.next()));
        }
        System.out.println(sum);
    }
}