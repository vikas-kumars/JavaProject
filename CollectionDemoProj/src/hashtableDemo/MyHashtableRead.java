package hashtableDemo;

import java.util.Hashtable;
import java.util.Set;

public class MyHashtableRead {

	public static void main(String[] args) {
		Hashtable<String,String> ht=new Hashtable<String,String>();
		ht.put("first", "one");
		ht.put("second", "two");
		ht.put("third","three");
		ht.put("fourth", "four");
		//Set<String> keySet=ht.keySet();
		for(String key:ht.keySet()) {
			System.out.println("Value of "+key+" is: "+ht.get(key));
		}
	}

}
