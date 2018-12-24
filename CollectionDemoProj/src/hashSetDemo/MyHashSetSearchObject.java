package hashSetDemo;

import java.util.HashSet;

public class MyHashSetSearchObject {

	public static void main(String[] args) {
		HashSet<Price1> hs=new HashSet<Price1>();
		hs.add(new Price1("Apple",20));
		hs.add(new Price1("Mango",50));
		hs.add(new Price1("Berry",30));
		for(Price1 p:hs) {
			System.out.println(p);
		}
		Price1 key=new Price1("Berry",30);
		System.out.println("Is containing key: "+hs.contains(key));
	}

}

class Price1{
	private String item;
	private int Price1;
	public Price1(String item,int Price1) {
		this.item=item;
		this.Price1=Price1;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getPrice1() {
		return Price1;
	}
	public void setPrice1(int Price1) {
		this.Price1 = Price1;
	}
	@Override
	public String toString() {
		return "Price1 [item=" + item + ", Price1=" + Price1 + "]";
	}
	
	public int hashCode() {
		System.out.println("in hashcode");
		int hashcode=Price1*20;
		hashcode+=item.hashCode();
		return hashcode;
	}
	
	public boolean equals(Object obj) {
		Price1 pp=null;
		if(obj instanceof Price1) {
			pp=(Price1)obj;
			return(pp.item.equals(this.item) && pp.Price1==this.Price1);
		}else {
			return false;
		}
	}
}
