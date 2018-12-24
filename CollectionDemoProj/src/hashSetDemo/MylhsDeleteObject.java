package hashSetDemo;

import java.util.HashSet;

public class MylhsDeleteObject {

	public static void main(String[] args) {
		HashSet<Price2> hs=new HashSet<Price2>();
		hs.add(new Price2("Mango",20));
		hs.add(new Price2("Apple",80));
		hs.add(new Price2("Berry",40));
		System.out.println("Original hashset :");
		for(Price2 p:hs) {
			System.out.println(p);
		}
		Price2 sub=new Price2("Berry",40);
		hs.remove(sub);
		System.out.println("After deleting user define object: ");
		for(Price2 p:hs) {
			System.out.println(p);
		}
		
	}

}

class Price2{
	private int price;
	private String item;
	
	public Price2(String item, int price) {
		this.item=item;
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice2(int price) {
		this.price = price;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "Price2 [Price=" + price + ", item=" + item + "]";
	}
	
	public int hashCode() {
		System.out.println("In hashcode");
		int hashcode=0;
		hashcode=price*20;
		hashcode=item.hashCode();
		return hashcode;
	}
	
	public boolean equals(Object obj) {
		System.out.println("In equals");
		if(obj instanceof Price2) {
			Price2 pp=(Price2)obj;
			return(pp.item.equals(this.item) && pp.price==this.price);
		}else {
			return false;
		}
	}
}
