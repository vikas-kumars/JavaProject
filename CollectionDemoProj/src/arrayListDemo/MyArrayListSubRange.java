package arrayListDemo;

import java.util.ArrayList;

public class MyArrayListSubRange {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("first");
		al.add("second");
		al.add("third");
		al.add("fourth");
		al.add("fifth");
		System.out.println("sublist of arrayList: "+al.subList(2, 4));
	}

}
