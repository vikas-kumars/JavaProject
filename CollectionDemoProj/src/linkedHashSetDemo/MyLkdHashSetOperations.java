package linkedHashSetDemo;

import java.util.LinkedHashSet;

public class MyLkdHashSetOperations {

	public static void main(String[] args) {
		LinkedHashSet<String> lh=new LinkedHashSet<String>();
		lh.add("vikas");
		lh.add("kumar");
		lh.add("sahu");
		System.out.println("Original LinkedHashSet: "+lh);
		System.out.println("Is Empty: "+lh.isEmpty());
		System.out.println("Size of LinkedList: "+lh.size());
	}

}
