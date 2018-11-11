package signiwis;

public final class Immutable{
	private int i;
	Immutable(int i){
		this.i=i;
	}
	public Immutable modify(int i) {
		if(this.i==i) {
			return this;
		}else {
			return (new Immutable(i));
		}
	}
	public static void main(String [] args) {
		Immutable i1=new Immutable(100);
		Immutable i2=i1.modify(10);
		Immutable i3=i1.modify(100);
		System.out.println(i1==i3);
		System.out.println(i1==i2);
	}
}