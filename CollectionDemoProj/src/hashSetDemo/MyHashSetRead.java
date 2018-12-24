package hashSetDemo;

import java.util.HashSet;
import java.util.Iterator;

public class MyHashSetRead {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("first");
		hs.add("second");
		hs.add("third");
		hs.add("fourth");
		hs.add("fifth");
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
