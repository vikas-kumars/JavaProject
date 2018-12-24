package stackDemo;

public class MyMain {
	public static void main(String[] args) throws StackEmptyExcept	{
		Stack st=new Stack();
		System.out.println(st.isEmpty());
		st.push(15);
		st.push(8);
		System.out.println("top most element: "+st.peek());
		st.push(29);
		st.show();
		System.out.println();
		System.out.println("size is: "+st.size());
		System.out.println("removing top most element: "+st.pop());
		System.out.println("size is: "+st.size());
		System.out.println(st.isEmpty());
		

		
		
	}

}
