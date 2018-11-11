package solution;

import java.util.Scanner;

public class TimeConversion {

	 public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 String[] str=s.nextLine().split(":");
		 String hour=str[0];
		 String min=str[1];
		 String sec=str[2].substring(0, 2);
		 String aa=str[2].substring(2,4);
		 if(aa.equals("AM")) {
			 System.out.println((hour.equals("12")?"00":hour)+":"+min+":"+sec);
		 }else {
			 System.out.println((hour.equals("12")?hour:(Integer.parseInt(hour)+12))+":"+min+":"+sec);
		 }
	 }
	}
