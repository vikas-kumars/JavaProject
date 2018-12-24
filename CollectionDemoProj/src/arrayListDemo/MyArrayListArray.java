package arrayListDemo;

import java.util.ArrayList;

public class MyArrayListArray {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("first");
		al.add("second");
		al.add("third");
		al.add("fourth");
		al.add("fifth");
		System.out.println("Original arrayList: "+al);
		/*String[] arrayForm=new String[al.size()];
		al.toArray(arrayForm);*/
		String[] arrayForm=al.toArray(new String[al.size()]);
		//String[] arrayForm=(String[]) al.toArray();// Will give error castexception
		for(String str:arrayForm) {
			System.out.print(str+" ");
		}
	}

}
