package java2nvoice;

public class MySingleton {
	
	private static MySingleton myObj;
	static {
	myObj=new MySingleton();
	}
	private MySingleton(){
	}
	public static MySingleton getInstance(){
	return myObj;
	}
	public void test(){
	System.out.println("Hello this is test");
	}

	public static void main(String[] args){
	MySingleton ms=getInstance();
	ms.test();
	}

}
