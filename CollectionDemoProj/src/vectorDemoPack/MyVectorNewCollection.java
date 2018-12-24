package vectorDemoPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MyVectorNewCollection {

	public static void main(String[] args) {
		Vector<String> vct=new Vector<String>();
		vct.add("first");
		vct.add("second");
		vct.add("third");
		System.out.println("Original vctor: "+vct);
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		vct.addAll(list);
		System.out.println("After copying list to vector: "+vct);
		
	}

}
