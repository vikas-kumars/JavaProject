package signiwis;

public class Singleton {
	private static Singleton myobj;
	static {
		myobj=new Singleton();
	}
	private Singleton(){
		
	}
	public static Singleton getInstance() {
		return myobj;
	}
	public void test() {
		System.out.println("this is test");
	}

	public static void main(String[] args) {
		Singleton s=getInstance();
		s.test();
	}

}
