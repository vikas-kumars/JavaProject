package hashtableDemo;

import java.util.Hashtable;

public class MyHashtableKeySearch {

	public static void main(String[] args) {
		Hashtable<String,String> ht=new Hashtable<String,String>();
		ht.put("first","one");
		ht.put("second","two");
		ht.put("third","three");
		ht.put("fourth","four");
		ht.put("fifth","five");
		System.out.println("Is containg third as key: "+ht.containsKey("third"));
		
	}

}
