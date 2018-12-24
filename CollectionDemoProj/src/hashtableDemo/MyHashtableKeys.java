package hashtableDemo;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class MyHashtableKeys {

	public static void main(String[] args) {
		Hashtable<String,String> ht=new Hashtable<String,String>();
		ht.put("one","first");
		ht.put("two","second");
		ht.put("three","third");
		ht.put("four","fourth");
		Set<String> keySet=ht.keySet();
		System.out.println("Set of keys in map object: "+keySet);
		
	}

}
