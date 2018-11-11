package java2nvoice;

import java.util.Scanner;

public class DuplicateWord {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String input=s.nextLine();
		String words[]=input.split(" ");
		int wrc=1;
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					wrc=wrc+1;
					words[j]="0";
					
				}
			}
			if(words[i]!="0") 
				System.out.println(words[i]+"------->"+wrc);
				wrc=1;
			
		}
		

	}

}
