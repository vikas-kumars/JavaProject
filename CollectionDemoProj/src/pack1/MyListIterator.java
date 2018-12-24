package pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MyListIterator {
	public static void main(String[] args) {
		List <Integer> list= new ArrayList<Integer>();
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(104);
		list.add(105);
		ListIterator<Integer> litr=list.listIterator();
		System.out.println("Element in forward direction :");
		while(litr.hasNext()) {
			System.out.print(litr.next()+" ");
		}
		System.out.println();
		System.out.println("Element in Backward direction :");
		while(litr.hasPrevious()) {
			System.out.print(litr.previous()+" ");
		}
		
	}
}
