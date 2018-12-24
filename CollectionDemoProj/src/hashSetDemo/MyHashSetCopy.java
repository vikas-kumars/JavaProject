package hashSetDemo;

import java.util.HashSet;

public class MyHashSetCopy {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("first");
		hs.add("second");
		System.out.println("Original hashset: "+hs);
		HashSet<String> subset=new HashSet<String>();
		subset.add("third");
		subset.add("four");
		hs.addAll(subset);
		System.out.println("After adding subset in hashset: "+hs);
	}

}
