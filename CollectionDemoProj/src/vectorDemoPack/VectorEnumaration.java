package vectorDemoPack;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnumaration {

	public static void main(String[] args) {
		Vector<Integer> vct=new Vector<Integer>();
		vct.add(1);
		vct.add(2);
		vct.add(3);
		vct.add(4);
		vct.add(5);
		Enumeration<Integer> en=vct.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
