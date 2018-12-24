package pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyItrRemoveElement {

	public static void main(String[] args) {
		List <String> list=new ArrayList<String>();
		list.add("java");
		list.add("Unix");
		list.add("JavaScript");
		list.add("C++");
		list.add("C-lang");
		System.out.println("Before removing "+list);
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			if(itr.next().contains("Unix")) {
				itr.remove();
			}
		}
		System.out.println("After removing "+list);
	}

}
