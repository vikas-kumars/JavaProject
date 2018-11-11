package signiwis;

import java.util.Scanner;

public class DuplicateWord {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.nextLine();
		String []word=str.split(" ");
		int wrc=1;
		for(int i=0;i<word.length;i++) {
			for(int j=i+1;j<word.length;j++) {
				if(word[i].equals(word[j])) {
					wrc=wrc+1;
					word[j]="0";
					
				}
			}
			if(word[i]!="0") {
				System.out.println(word[i]+" -----------> "+wrc);
			}
			wrc=1;
		}

	}

}
