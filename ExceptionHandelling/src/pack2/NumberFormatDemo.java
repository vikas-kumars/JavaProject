package pack2;

public class NumberFormatDemo {

	public static void main(String[] args) {
		try {
			int n=Integer.parseInt("xyz");
			System.out.println(n);
		}catch(NumberFormatException e) {
			System.out.println("Provide number instead of string/char");
		}
	}

}
