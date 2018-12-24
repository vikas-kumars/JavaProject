package hashtableDemo;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class MyHashtableEnumaration {

	public static void main(String[] args) {
		Hashtable<String,String> hs=new Hashtable<String,String>();
		hs.put("first","one");
		hs.put("second","two");
		hs.put("third","three");
		hs.put("fourth","five");
		hs.put("fifth","five");
		Enumeration<String> keys=hs.keys();
		while(keys.hasMoreElements()) {
			String key=keys.nextElement();
			System.out.println("Value of "+key+" is "+hs.get(key));
		}
	}

}