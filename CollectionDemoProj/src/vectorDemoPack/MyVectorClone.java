package vectorDemoPack;

import java.util.Vector;

public class MyVectorClone {

	public static void main(String[] args) {
		Vector<Integer> vct=new Vector<Integer>();
		vct.add(1);
		vct.add(2);
		vct.add(3);
		vct.add(4);
		vct.add(5);
		System.out.println("Original vector: "+vct);
		Vector<Integer> copyVct=(Vector<Integer>)vct.clone();
		System.out.println("cloned vector: "+copyVct);
	}

}
