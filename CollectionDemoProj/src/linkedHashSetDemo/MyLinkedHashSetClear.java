package linkedHashSetDemo;

import java.util.LinkedHashSet;

public class MyLinkedHashSetClear {

	public static void main(String[] args) {
		LinkedHashSet<String> lh=new LinkedHashSet<String>();
		lh.add("One");
		lh.add("two");
		lh.add("three");
		System.out.println("Original LinkedHashSet: "+lh);
		lh.clear();
		System.out.println("After clearing: "+lh);
	}

}
