package arrayListDemo;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListNewCollection {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		List<String> list=new ArrayList<String>();
		list.add("first");
		list.add("second");
		list.add("third");
		al.addAll(list);
		System.out.println(al);
		
	}

}
