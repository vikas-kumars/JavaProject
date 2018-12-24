package arrayListDemo;

import java.util.ArrayList;

public class MyArrayListClone {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("first");
		al.add("second");
		al.add("third");
		al.add("fourth");
		al.add("fifth");
		System.out.println("original ArrayList: "+al);
		ArrayList<String> list=(ArrayList<String>)al.clone();
		System.out.println("clone ArrayList: "+list);
	}

}
