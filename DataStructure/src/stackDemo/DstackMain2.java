package stackDemo;

public class DstackMain2 {
	public static void main(String[] args) {
		DStack st=new DStack();
		st.push(15);
		st.show();
		st.push(8);
		st.show();
		st.push(10);
		st.show();
		st.push(18);
		st.show();
		st.push(21);		
		st.show();
		st.push(29);
		st.show();
		st.pop();
		st.pop();
		st.pop();
		st.show();
		st.pop();
		st.show();
		st.pop();
		st.pop();
		st.show();
		st.pop();// will throw an exception stack is empty still trying to remove
		
	}


}
