package vectorDemoPack;

import java.util.Vector;

public class ClearMyVector {

	public static void main(String[] args) {
		Vector<String> vct=new Vector<String>();
		vct.add("first");
		vct.add("second");
		vct.add("third");
		System.out.println("original vector: "+vct);
		vct.clear();
		System.out.println("vector cleared: "+vct);
	}

}
