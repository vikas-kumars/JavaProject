package hashSetDemo;

import java.util.HashSet;

public class MyHashSetToArray {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("vikas");
		hs.add("nancy");
		hs.add("Suresh");
		hs.add("mahtab");
		System.out.println("Original hashset: "+hs);
		String[] copyArr=hs.toArray(new String[hs.size()]);
		System.out.println("HashSet to Array");
		for(String str:copyArr) {
			System.out.println(str);
		}
	}

}
