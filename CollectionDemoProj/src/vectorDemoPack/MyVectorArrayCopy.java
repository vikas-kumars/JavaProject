package vectorDemoPack;

import java.util.Vector;

public class MyVectorArrayCopy {

	public static void main(String[] args) {
		Vector<String> vct= new Vector<String>();
		vct.add("first");
		vct.add("second");
		vct.add("third");
		vct.add("fourth");
		vct.add("fifth");
		System.out.println("Original Vector: "+vct);
		String[] copyToArray= new String[vct.size()];
		vct.copyInto(copyToArray);
		//String[] copyToArray= vct.toArray(new String[vct.size()]);
		for(String str:copyToArray) {
			System.out.print(str+" ");
		}
		 
	}

}
