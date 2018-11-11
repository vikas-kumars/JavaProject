package solution;

import java.util.Scanner;

public class UppertoLower {
	public static void main(String[] args) {
		/* int i,len;
	        char ch;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter String: ");
	        String str=sc.nextLine();
	        len=str.length();
	        for(i=0;i<len;i++)
	        {
	            ch=str.charAt(i);
	            if(Character.isUpperCase(ch))
	                System.out.print(Character.toLowerCase(ch));
	            else
	                System.out.print(Character.toUpperCase(ch));
	        }*/
		
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		String str="";
		for(int i=0;i<string.length();i++) {
			char c=string.charAt(i);
			if(c>=65 && c<=90)
				str=str+(char)(c+32);
			else if(c>=97 && c<=122)
				str+=(char)(c-32);
			else
				str+=c;
		}
		System.out.println(str);
	}
}
