package arrayListDemo;

import java.util.ArrayList;

public class MyListToCsvString {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("first");
		al.add("second");
		al.add("third");
		al.add("fourth");
		System.out.println(convertToCsv(al));
	}

	private static String convertToCsv(ArrayList<String> al) {
		String str=new String();
		for(String st:al) {
			if(str.length()!=0) {
				str=str.concat(",");
			}
			str=str.concat(st);
		}
		return str;
	}

}
