package linkedListDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedListIterate {

	public static void main(String[] args) //throws InterruptedException
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("first");
		ll.add("second");
		ll.add("third");
		ll.add("fourth");
		ll.add("fifth");
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			//Thread.sleep(200);
		}
	}

}
