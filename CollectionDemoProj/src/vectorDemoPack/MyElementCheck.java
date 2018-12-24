package vectorDemoPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MyElementCheck {

	public static void main(String[] args) {
		Vector<String> vct= new Vector<String>();
		vct.add("first");
		vct.add("second");
		vct.add("third");
		vct.add("fourth");
		vct.add("fifth");
		List<String> list=new ArrayList<String>();
		list.add("second");
		list.add("fifth");
		System.out.println("Does vector contains all list elements?: "+vct.containsAll(list));
		list.add("one");
		System.out.println("Does vector contains all list elements?: "+vct.containsAll(list));
	}

}
