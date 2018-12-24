package pack1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		List<Integer> list=new LinkedList<Integer>();
		list.add(5);
		list.add(9);
		list.add(2);
		list.add(6);
		list.add(4);
		Scanner scr=new Scanner(System.in);
		int n=Integer.parseInt(scr.nextLine());
		boolean b=false;
		for(int i=0;i<list.size();i++) {
			int n1=list.get(i).intValue();
			for(int j=0;j<list.size();j++) {
				int n2=list.get(j).intValue();
				if(i!=j) {
					if(n1+n2==n) {
						b=true;
						break;
					}
				}
			}
		}
		System.out.println(b);
	}
}



/*Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.*/