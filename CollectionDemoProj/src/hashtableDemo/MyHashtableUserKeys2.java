package hashtableDemo;

import java.util.Hashtable;

public class MyHashtableUserKeys2 {

	public static void main(String[]args) {
		Hashtable<Empl5,String> ht=new Hashtable<Empl5,String>();
		ht.put(new Empl5("Rahul",201), "Rahul");
		ht.put(new Empl5("Sachin",202), "Sachin");
		ht.put(new Empl5("Virat",203),"Virat");
		System.out.println("Fetching value from keys");
		Empl5 e=new Empl5("Virat",203);
		System.out.println(e+"===>"+ht.get(e));
	}

}

class Empl5{
	private String name;
	private int id;
	public Empl5(String name,int id) {
		this.id=id;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	@Override
	public String toString() {
		return "Empl5 [name=" + name + ", id=" + id + "]";
	}
	public int hashCode() {
		System.out.println("In hashcode");
		return this.getId();
	}
	
	public boolean equals(Object obj) {
		Empl5 e=null;
		if(obj instanceof Empl5) {
			e=(Empl5)obj;
		}
		System.out.println("In equals() ");
		if(this.getId()==e.getId()) {
			return true;
		}
		else {
			return false;
		}
	}
}
