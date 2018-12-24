package hashtableDemo;

import java.util.Hashtable;

public class MyHashtableCopy {

	public static void main(String[] args) {
		Hashtable<String,String> ht=new Hashtable<String,String>();
		ht.put("first","one");
		ht.put("second", "two");
		ht.put("third","three");
		System.out.println("Original hashtable: "+ht);
		Hashtable<String,String> subHt=new Hashtable<String,String>();
		subHt.put("fourth", "four");
		subHt.put("fifth", "five");
		ht.putAll(subHt);
		System.out.println("After adding a content: "+ht);
		
	}

}
