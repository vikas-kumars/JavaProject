package java2nvoice;

public class MySingle implements Cloneable {
	private static MySingle myObj;
	static {
		 myObj=new MySingle();
		 }
	private MySingle() {
		
	}
	public synchronized static MySingle getInstance() {
		return myObj;
	}
	public void test() {
		System.out.println("This is test");
	}
	public static void main(String[] args) {
		MySingle ms=getInstance();
		ms.test();
	}@Override
	public Object clone() throws CloneNotSupportedException {
		 throw new CloneNotSupportedException();
		//return super.clone();
	}

}
