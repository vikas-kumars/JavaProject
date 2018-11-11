package solution;

import java.math.BigInteger;
import java.util.Scanner;

public class MinMaxSum {

	public static void main(String[] args) {
		long arr[]=new long[5];
		Scanner s=new Scanner(System.in);
		long sum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		  for(int i=0;i<arr.length;i++){
	            for(int j=i+1;j<arr.length;j++){
	                if(arr[i]>arr[j]){
	                    long t=arr[i];
	                    arr[i]=arr[j];
	                    arr[j]=t;
	                }
	            }
	        }
	        
	        for(int i=0;i<arr.length;i++){
	            sum=sum+arr[i];
	        }
	        long a=sum-arr[0];
	        long b=sum-arr[arr.length-1];
	        Long c=Long.valueOf(a);
	        Long d=Long.valueOf(b);
	        System.out.println(d+" "+c);

	}

}
