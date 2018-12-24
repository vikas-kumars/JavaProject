package stackDemo;

public class Stack {
	int top=0;
	int stack[]=new int[5];
	public void push(int i)  {
		if(top>4) {
			//System.out.println("Stack is full");
			try {
				throw new StackFullException("Stack is full exception");
			} catch (StackFullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}else {
			stack[top]=i;
			top++;
		}
	}

	public int peek() {
		return stack[top-1];
	}

	public int pop() throws StackEmptyExcept {
		int n=0;
		if(isEmpty()) {
			//System.out.println("Stack is empty");
			throw new StackEmptyExcept("Stack is empty no element to remove");
		}else {
		top--;
		n=stack[top];
		stack[top]=0;
		}
		return n;
	}

	public void show() {
		for(int i:stack) {
			System.out.print(i+" ");
		}
		System.out.println();

	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		return top<=0;
	}

}

class StackEmptyExcept extends Exception{
	public StackEmptyExcept(String s) {
		super(s);
	}
}

class StackFullException extends Exception{
	public StackFullException(String s) {
		super(s);
	}
}
