package arrayListDemo;

import java.util.ArrayList;

public class MyBasicArrayList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("java");
		list.add("c++");
		list.add("perl");
		list.add("php");
		System.out.println(list);
		System.out.println("element at 3: "+list.get(3));
		System.out.println("Does list contain java: "+list.contains("java"));
		list.add(2, "play");
		System.out.println("element added to index 2: "+list);
		System.out.println("is List empty? "+list.isEmpty());
		System.out.println("Index of perl is "+list.indexOf("perl"));
		System.out.println("size of list: "+list.size());
	}

}
