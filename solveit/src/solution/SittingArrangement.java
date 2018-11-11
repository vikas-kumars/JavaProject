package solution;

import java.util.Scanner;

public class SittingArrangement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] arrangement = { "WS", "MS", "AS", "AS", "MS", "WS" };
	        
			Scanner scanner = new Scanner(System.in);
			int t = scanner.nextInt();
	 
			for (int i = 0; i < t; i++) {
				int num = scanner.nextInt();
				int divider = num / 12;
				int remainder = num % 12;
				int oppositeSeatNum = 13 - remainder;
				if (remainder == 0) {
					oppositeSeatNum = num - 11;
				} else {
					oppositeSeatNum = divider * 12 + oppositeSeatNum;
				}
				System.out.println(oppositeSeatNum + " " + arrangement[((num - 1) % 6)]);
			}
				

	}

}
