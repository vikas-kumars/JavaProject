package hashSetDemo;

import java.util.HashSet;

public class MyHashSetRetain {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("vikas");
		hs.add("sahu");
		hs.add("Mahtab");
		hs.add("Iqbal");
		System.out.println("Original hashset: "+hs);
		HashSet<String> subset=new HashSet<String>();
		subset.add("vikas");
		subset.add("sahu");
		hs.retainAll(subset);
		System.out.println("retain all: "+hs);
	}

}
