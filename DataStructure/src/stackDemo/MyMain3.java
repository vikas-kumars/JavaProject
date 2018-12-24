package stackDemo;

public class MyMain3 {
	public static void main(String[] args) throws StackEmptyExcept {
		Stack st=new Stack();
		st.push(15);
		st.show();
		st.push(8);
		st.show();
		st.push(10);
		st.show();
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println("size is "+st.size());
		System.out.println(st.pop());
		
	}

}
