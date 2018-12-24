package hashtableDemo;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class MyHashtableEntrySet {

	public static void main(String[] args) {
		Hashtable<String,String> ht=new Hashtable<String,String>();
		ht.put("one","first");
		ht.put("two","second");
		ht.put("three","third");
		Set<Entry<String,String>> entries=ht.entrySet();
		for(Entry<String,String> entry:entries) {
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
	}

}
