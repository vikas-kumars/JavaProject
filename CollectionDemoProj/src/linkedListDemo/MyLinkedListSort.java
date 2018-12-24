package linkedListDemo;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class MyLinkedListSort {

	public static void main(String[] args) {
		LinkedList<Empl> ll=new LinkedList<Empl>();
		ll.add(new Empl("Tom",6000));
		ll.add(new Empl("Jerry",2400));
		ll.add(new Empl("Mahtab",8000));
		ll.add(new Empl("Amit",7000));
		Collections.sort(ll, new MySort());
		System.out.println("Sorted list entries: ");
		for(Empl e: ll) {
			System.out.println(e);
		}
		
	}

}

class MySort implements Comparator<Empl>{
	public int compare(Empl e1,Empl e2) {
		if(e1.getSalary()<e2.getSalary()) {
			return 1;
		}else {
			return -1;
		}
	}
}



class Empl{
	private String name;
	private int salary;
	public Empl(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Empl [name=" + name + ", salary=" + salary + "]";
	}
	
	
}
