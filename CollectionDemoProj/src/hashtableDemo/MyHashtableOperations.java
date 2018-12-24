package hashtableDemo;

import java.util.Hashtable;

public class MyHashtableOperations {

	public static void main(String[] args) {
		Hashtable<String,String> ht=new Hashtable<String,String>();
		ht.put("first", "One");
		ht.put("second", "two");
		ht.put("third", "three");
		System.out.println(ht);
		System.out.println("Value of key second: "+ht.get("second"));
		System.out.println("Is Hashtable empty: "+ht.isEmpty());
		ht.remove("third");
		System.out.println(ht);
		System.out.println("Size of Hashtable: "+ht.size());
		
	}

}
