package arrayListDemo;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayListShuffle {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("first");
		al.add("second");
		al.add("third");
		al.add("fourth");
		al.add("fifth");
		System.out.println("Original ArrayList: "+al);
		Collections.shuffle(al);
		System.out.println("Shuffled ArrayList: "+al);
	}

}
