package hashtableDemo;

import java.util.Hashtable;
import java.util.Set;

public class MyHashtableDupEntry {

	public static void main(String[] args) {
		Hashtable<Empl2,String> ht=new Hashtable<Empl2,String>();
		ht.put(new Empl2(201,"Tom"),"Tom");
		ht.put(new Empl2(202,"Shyam"),"Shyam");
		ht.put(new Empl2(203,"Ravi"),"Ravi");
		System.out.println("Adding the duplicate");
		ht.put(new Empl2(202,"Shyam"),"Shyam");
		Set<Empl2> keys=ht.keySet();
		for(Empl2 key: keys) {
			System.out.println(key+"====>"+ht.get(key));
		}
		System.out.println("Duplicate got eliminated");
		
	}

}

class Empl2{
	private String name;
	private int id;
	
	public Empl2(int id,String name) {
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
		return "Empl2 [name=" + name + ", id=" + id + "]";
	}

	public int hashCode() {
		System.out.println("In hashCode");
		return this.getId();
	}
	
	public boolean  equals(Object obj) {
		Empl2 e=null;
		if(obj instanceof Empl2) {
			e=(Empl2)obj;
		}
		System.out.println("In equals");
		if(this.getId()==e.getId()) {
			return true;
		}else {
			return false;
		}
	}
	
}
