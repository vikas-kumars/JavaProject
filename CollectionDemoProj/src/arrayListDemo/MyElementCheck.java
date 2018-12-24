package arrayListDemo;

import java.util.ArrayList;
import java.util.List;

public class MyElementCheck {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList();
		al.add("first");
		al.add("second");
		al.add("third");
		al.add("fourth");
		al.add("fifth");
		System.out.println("Original arrayList "+al);
		List<String> list=new ArrayList<String>();
		list.add("second");
		list.add("fifth");
		System.out.println("Is second and fifth present in list: "+al.containsAll(list));
		list.add("random");
		System.out.println("Is second,fifth and random present in list: "+al.containsAll(list));
	}

}
