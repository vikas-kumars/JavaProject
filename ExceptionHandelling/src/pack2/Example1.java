package pack2;

public class Example1 {

	public static void main(String[] args) {
		try {
			int num1=30;
			int num2=0;
			System.out.println(num1/num2);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
