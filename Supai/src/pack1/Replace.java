package pack1;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Replace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Paragraph:");
		String s=sc.nextLine();
		String st="";
		TreeMap<String,Integer> m=new TreeMap<String,Integer>();
		for(int i=0;i<s.length();i++)
		{				
			char cc=s.charAt(i);
			if(cc>=65&&cc<=90||cc>=97&&cc<=122)
			{
				if(s.charAt(i)>=65&&s.charAt(i)<=90) 
					st=st+(char)((int)cc+32);						
				else
					st=st+cc;	

			}
			else
			{
				if(!st.isEmpty())
				{
					if(m.containsKey(st))
					{
						m.put(st,m.get(st)+1);
						st="";	
					}
					else 
					{
						m.put(st,1);
						st="";	
					}
				}
				else
				{
					continue;
				}				
			}
		}
		//System.out.println(m);
		if(!st.isEmpty())
		{
			if(m.containsKey(st))
			{
				m.put(st,m.get(st)+1);		
			}
			else 
			{
				m.put(st, 1);	
			}
		}
		for(Map.Entry<String,Integer> e:m.entrySet())
		{
			System.out.println(e);
		}	
	}}
