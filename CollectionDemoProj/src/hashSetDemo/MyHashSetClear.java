package hashSetDemo;

import java.util.HashSet;

public class MyHashSetClear {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("first");
		hs.add("second");
		hs.add("third");
		System.out.println("Original hashSet: "+hs);
		hs.clear();
		System.out.println("After clearing hashset: "+hs);
	}

}
