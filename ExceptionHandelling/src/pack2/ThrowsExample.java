package pack2;

import java.io.IOException;

public class ThrowsExample {
	public static void main(String[] args) {
		ThrowsDemo tm=new ThrowsDemo();
			try {
				tm.method1(1);
			} catch (ClassNotFoundException | IOException e) {
				//System.out.println(e);
				//e.printStackTrace();
				System.err.println(e);
			}
	}

}

class ThrowsDemo{

	public void method1(int i) throws IOException, ClassNotFoundException {
		if(i==1) {
			throw new IOException("IOException Occured");
		}else {
			throw new ClassNotFoundException();
		}
		
	}
	
}
