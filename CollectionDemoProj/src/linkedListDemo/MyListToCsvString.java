package linkedListDemo;

import java.util.LinkedList;

public class MyListToCsvString {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("vikas");
		ll.add("sahu");
		ll.add("amit");
		ll.add("mahtab");
		toCsv(ll);
	}

	public static void toCsv(LinkedList<String> ll) {
		String str=new String();
		for(String s:ll) {
			if(str.length()>0) {
				str=str.concat(",");
			}
			str=str.concat(s);
		}
		System.out.println(str);
	}

}
