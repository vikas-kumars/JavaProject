package stringinter;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] array=str.split(" ");
		int wrc=1;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i].equals(array[j])) {
					wrc++;
					array[j]="0";
				}
			}
			if(array[i]!="0") {
				System.out.println(array[i]+"---------->"+wrc);
			}
			wrc=1;
		}
		

	}

}
