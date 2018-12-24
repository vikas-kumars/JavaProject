package hashSetDemo;

import java.util.HashSet;

public class MyDistElementEx {

	public static void main(String[] args) {
		HashSet<Price> hs=new HashSet<Price>();
		hs.add(new Price("Apple",20));
		hs.add(new Price("berry",50));
		hs.add(new Price("Mango",50));
		for(Price p:hs) {
			System.out.println(p);
		}
		Price duplicate=new Price("berry",50);
		System.out.println("Inserting duplicate in hashset");
		hs.add(duplicate);
		System.out.println("After insertion");
		for(Price pr:hs) {
			System.out.println(pr);
		}
	}

}

class Price{
	private String item;
	private int price;
	
	public Price(String item,int price) {
		this.item=item;
		this.price=price;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Price [item=" + item + ", price=" + price + "]";
	}
	
	
	public int hashCode() {
		System.out.println("In hashcode");
		int hashcode=0;
		hashcode=price*20;
		hashcode +=item.hashCode();
		System.out.println(hashcode);
		return hashcode;
	}
	public boolean equals(Object obj) {
		System.out.println("In equals");
		//Price pp=null;
		if(obj instanceof Price) {
			Price pp=(Price)obj;
			return (pp.item.equals(this.item) && pp.price == this.price);
		}else {
			return false;
		}
	}
}
