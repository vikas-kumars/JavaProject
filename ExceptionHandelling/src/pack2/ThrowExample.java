package pack2;

public class ThrowExample {

	public static void main(String[] args) {
		System.out.println("Welcome to resistration page");
		checkeligibility(10,39);
		System.out.println("Have a nice day");
	}

	private static void checkeligibility(int stuage, int stuwei) 
	{
		if(stuwei<40 && stuage<12 ) {
			throw new ArithmeticException("Student is not eligible for registration");
		}else {
			System.out.println("student is eligible");
		}
		
	}

}
