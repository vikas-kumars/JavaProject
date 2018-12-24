package vectorDemoPack;

import java.util.Iterator;
import java.util.Vector;

public class VectoIterate {

	public static void main(String[] args) {
		Vector<String> vct=new Vector<String>();
		vct.add("first");
		vct.add("second");
		vct.add("third");
		Iterator<String> itr=vct.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
