package signiwis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		List<Integer> a=new ArrayList<Integer>();
		System.out.println("enter the 3 element");
		int i=1;
		while(i<=3) {
			a.add(s.nextInt());
			i++;
		}
		i=1;
		List<Integer> b=new ArrayList<Integer>();
		System.out.println("enter another 3 element");
		while(i<=3) {
			b.add(s.nextInt());
			i++;
		}
		compare(a,b);
	}

	private static void compare(List<Integer> a, List<Integer> b) {
		int count1=0, count2=0;
		//System.out.println(a.size());
		for(int  j=0;j<a.size();j++) {
				if((Integer)a.get(j)>(Integer)b.get(j)) {
					count1++;
				}else if((Integer)a.get(j)<(Integer)b.get(j)) {
					count2++;
				
			}			
		}
		System.out.println(count1+" "+count2);
	}

}
