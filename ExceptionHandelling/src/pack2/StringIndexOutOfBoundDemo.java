package pack2;

public class StringIndexOutOfBoundDemo {

	public static void main(String[] args) {
		try {
			String str="VikasSahu";
			System.out.println(str.length());
			char ch=str.charAt(0);
			ch=str.charAt(30);
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundException");
		}
	}

}
