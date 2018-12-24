package hashtableDemo;

import java.util.Hashtable;

public class MyHashtableClear {

	public static void main(String[] args) {
		Hashtable<String,String> hs=new Hashtable<String,String>();
		hs.put("vikas","sahu");
		hs.put("suresh","kumar");
		hs.put("nancy","agarwal");
		System.out.println("Before clearing hashtable: "+hs);
		hs.clear();
		System.out.println("Content after clearing: "+hs);
	}

}
