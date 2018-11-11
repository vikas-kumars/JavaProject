package solution;

import java.util.Scanner;

public class Datatype {

	public static void main(String[] args) {
		int i=4;
		double d=4.0;
		String s="HackerRank ";
		Scanner scan=new Scanner(System.in);
		int j=Integer.parseInt(scan.nextLine());
	    double db=Double.parseDouble(scan.nextLine());
		String str=scan.nextLine();
	    System.out.println(+(i+j));
	    System.out.println(+(d+db));
	    System.out.println(s.concat(str));
	       // scan.close();
		
	}

}
