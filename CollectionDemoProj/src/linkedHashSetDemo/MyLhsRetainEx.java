package linkedHashSetDemo;

import java.util.LinkedHashSet;

public class MyLhsRetainEx {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("vikas");
		lhs.add("suresh");
		lhs.add("nancy");
		lhs.add("Anuj");
		System.out.println("Before elmenating: "+lhs);
		LinkedHashSet<String> lh=new LinkedHashSet<String>();
		lh.add("vikas");
		lh.add("suresh");
		lhs.retainAll(lh);
		System.out.println("After eleminating "+lhs);
	}

}
