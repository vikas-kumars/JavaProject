package pack1;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		int n=Integer.parseInt(scr.nextLine());
	    int m = 1;
	    int i,j;
	    for( i=0; i<n-1; i++)
	    {
	        if(i!=1)
	        {
	        	for(j=1; j<=n-1; j++){
	        		System.out.print(m+"*");
	        		m++;
	        	}
	        	System.out.print(m);
	        	m++;
	        	System.out.println();
	        }else{
	        	m = m+n;
	        	for(j=1; j<=n-1; j++){
	        		System.out.print(m+"*");
	        		m++;
	        	}
	        	System.out.print(m);
	        	m++;
	        	System.out.println();
	        }
	    }
	    for(i=n+1 ;i<=(n+n)-1;i++){
	    	System.out.print(i+"*");
	    }
	    System.out.print(i);
	   System.out.println();
		
	}

}
