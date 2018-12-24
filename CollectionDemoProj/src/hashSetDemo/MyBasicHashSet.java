package hashSetDemo;

import java.util.HashSet;

public class MyBasicHashSet {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("first");
		hs.add("second");
		hs.add("third");
		System.out.println(hs);
		System.out.println("Is hashSet empty: "+hs.isEmpty());
		hs.remove("third");
		System.out.println("After removing: "+hs);
		System.out.println("Size of hashset: "+hs.size());
		System.out.println("Does hashset contain first: "+hs.contains("first"));
	}

}
