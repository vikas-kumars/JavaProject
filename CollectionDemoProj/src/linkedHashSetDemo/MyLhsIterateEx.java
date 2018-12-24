package linkedHashSetDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class MyLhsIterateEx {

	public static void main(String[] args) {
		LinkedHashSet<String> lh=new LinkedHashSet<String>();
		lh.add("One");
		lh.add("Two");
		lh.add("Three");
		System.out.println("Original LinkedHashSet: "+lh);
		Iterator<String> itr=lh.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
