package pack2;

public class ArrayIndexOutOfBoundDemo {

	public static void main(String[] args) {
		try {
			int [] num=new int[5];
			for(int i=1;i<=5;i++) {
				num[i]=i;
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundException");
		}
	}

}
