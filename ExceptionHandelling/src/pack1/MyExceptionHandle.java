package pack1;

public class MyExceptionHandle {
	public static void main(String[] args) {
		try {
			for(int i=5;i>=0;i--) {
				System.out.println(10/i);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("After loop");
	}

}
