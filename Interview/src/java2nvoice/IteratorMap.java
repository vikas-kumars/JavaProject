package java2nvoice;

import java.util.HashMap;
import java.util.Map;

public class IteratorMap {

	public static void main(String[] args) {
		Map<String,String> m=new HashMap<String,String>();
		m.put("vikas", "sahu");
		m.put("tanjeet", "verma");
		m.put("zebra", "fke");
		m.forEach((key,value)->System.out.println(key+" = "+value));

	}

}
