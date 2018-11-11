package solution;

import java.util.Scanner;

public class StringBreak {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		String str[]=new String[n];
		String s1="";
		String s2="";
		for(int i=0;i<n;i++) {
			str[i]=sc.nextLine();
			char ch[]=str[i].toCharArray();
			for(int j=0;j<ch.length;j++) {
				if(j%2==0) {
					s1+=""+ch[j];
				}else
					s2+=""+ch[j];
			}
			System.out.println(s1+" "+s2);
			 s1="";
			 s2="";
		}
		
		
	}

}
