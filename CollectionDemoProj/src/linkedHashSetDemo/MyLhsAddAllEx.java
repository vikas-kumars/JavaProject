package linkedHashSetDemo;

import java.util.LinkedHashSet;

public class MyLhsAddAllEx {

	public static void main(String[] args) {
		LinkedHashSet<String> lh=new LinkedHashSet<String>();
		lh.add("one");
		lh.add("two");
		lh.add("three");
		System.out.println("Original LinkedHashSet: "+lh);
		LinkedHashSet<String> subset=new LinkedHashSet<String>();
		subset.add("four");
		subset.add("five");
		lh.addAll(subset);
		System.out.println("After adding in  LinkedHashSet: "+lh);
	}

}
