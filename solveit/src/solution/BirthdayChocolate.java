package solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BirthdayChocolate {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the number of square in the choclatebar");
		int n=Integer.parseInt(scr.nextLine());
		System.out.println("Enter the integer on the square in chocobar");
		List<Integer> s=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			s.add(Integer.parseInt(scr.nextLine()));
		}
		System.out.println("Enter the day");
		int d=Integer.parseInt(scr.nextLine());
		System.out.println("Enter the month");
		int m=Integer.parseInt(scr.nextLine());
		int counter=0;
		for(int i=0;i<s.size();i++) {
			int length=0;
			int sum=0;
			for(int j=i;j<s.size();j++) {
				length++;
				sum+=s.get(j);
				if(sum==d && length==m) {
					counter++;
					break;
				}
				if(sum>d || length>m) {
					break;
				}
			}
		}
		System.out.println(counter);
		
	}

}

/*public static void main(String[] args) {
	Scanner scr=new Scanner(System.in);
	System.out.println("Enter the number of square in the choclatebar");
	int n=Integer.parseInt(scr.nextLine());
	System.out.println("Enter the integer on the square in chocobar");
	List<Integer> s=new ArrayList<Integer>();
	for(int i=0;i<n;i++) {
		s.add(Integer.parseInt(scr.nextLine()));
	}
	System.out.println("Enter the day");
	int d=Integer.parseInt(scr.nextLine());
	System.out.println("Enter the month");
	int m=Integer.parseInt(scr.nextLine());
	int counter=0;
	for(int i=0;i<s.size();i++) {
		if(i+m-1==s.size()) {
			break;
		}else {
			int sum=0;
			for(int j=00;j<m;j++) {					
				sum+=s.get(i+j);	
			}
			if(sum==d) {
				counter++;
			}
		}
	}
	System.out.println(counter);
	
}
*/