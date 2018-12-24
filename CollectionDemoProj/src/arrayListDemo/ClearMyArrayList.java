package arrayListDemo;

import java.util.ArrayList;

public class ClearMyArrayList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("first");
		al.add("second");
		al.add("third");
		System.out.println("Original ArrayList: "+al);
		al.clear();
		System.out.println("After clearing: "+al);
	}

}
