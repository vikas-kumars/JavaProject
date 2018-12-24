package pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) //throws InterruptedException
	{
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			//Thread.sleep(1000);
		}
	}

}
