package hashtableDemo;

import java.util.Hashtable;

public class MyHashtableUserKeys {

	public static void main(String[] args) {
		Hashtable<Empl,String> ht=new Hashtable<Empl,String>();
		ht.put(new Empl(201,"Ram"), "Ram");
		ht.put(new Empl(202,"Shyam"), "Shyam");
		ht.put(new Empl(203,"Iqbal"), "Iqbal");
		ht.put(new Empl(204,"Mahtab"), "Mahtab");
		System.out.println("Fetching value by creating new key");
		Empl e=new Empl(203,"Iabal");
		System.out.println(e+" ==> "+ht.get(e));
	}

}

class Empl{
	private int id;
	private String ename;
	public Empl(int id,String ename) {
		this.id=id;
		this.ename=ename;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Empl [id=" + id + ", ename=" + ename + "]";
	}
	
	public int hashCode() {
		System.out.println("In hashcode");
		return this.getId();
	}
	
	public boolean equals(Object obj) {
		Empl e=null;
		if(obj instanceof Empl) {
			e=(Empl)obj;
		}
		System.out.println("In equals");
		if(this.getId()==e.getId()) {
			return true;
		}else {
			return false;
		}
	}
}
