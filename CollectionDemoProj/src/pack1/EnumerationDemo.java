package pack1;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		Vector<String> li=new Vector<String>();
		li.add("java");
		li.add("c++");
		li.add("python");
		li.add("c-lang");
		li.add("perl");
		Enumeration<String> en=li.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
