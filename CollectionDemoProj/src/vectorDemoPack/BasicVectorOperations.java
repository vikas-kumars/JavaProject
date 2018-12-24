package vectorDemoPack;

import java.util.Vector;

public class BasicVectorOperations {

	public static void main(String[] args) {
		Vector<String> vct=new Vector<String>();
		vct.add("first");
		vct.add("second");
		vct.add("third");
		System.out.println("elements at starting: "+vct);
		vct.add(2, "random");
		System.out.println("Entering at particular index2: "+vct);
		System.out.println("Element at index 3: "+vct.get(3));
		System.out.println("Element at first: "+vct.firstElement());
		System.out.println("Element at last: "+vct.lastElement());
		System.out.println("Is this vector empty? "+vct.isEmpty());
	}

}
