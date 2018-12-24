package hashtableDemo;

import java.util.Hashtable;

public class MyHashtableValueSearch {

	public static void main(String[] args) {
		Hashtable<String,String> ht=new Hashtable<String,String>();
		ht.put("first","one");
		ht.put("second","two");
		ht.put("third","three");
		System.out.println("Is containing value two: "+ht.containsValue("two"));
	}

}
