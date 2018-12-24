package arrayListDemo;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayListReverse {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("first");
		al.add("second");
		al.add("third");
		al.add("fourth");
		al.add("five");
		System.out.println("original ArrayList: "+al);
		Collections.reverse(al);
		System.out.println("reverse ArrayList: "+al);
	}

}
