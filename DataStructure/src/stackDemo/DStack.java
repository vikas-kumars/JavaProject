package stackDemo;

public class DStack {
	int capacity=2;
	int top=0;
	int []stack=new int[capacity];

	public void push(int i) {
		if(size()==capacity) {
			expand();
		}
		stack[top]=i;
		top++;
	}

	private void expand() {
		int length=size();
		int[] newStack=new int[capacity*2];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack=newStack;
		capacity *= 2;
	}

	public int peek() {
		return stack[top-1];
	}

	public int pop() {
		int i=0;
		if(isEmpty()) {
			//System.out.println("Stack is empty");
			throw new StackEmptyException("Stack is empty still trying to remove");
		}else {
		i=stack[top-1];
		stack[top-1]=0;
		top--;
		shrink();
		}
		return i;
	}

	private void shrink() {
		int length=size();
		if(length<=(capacity/2)/2) {
			capacity=capacity/2;
		}
		int newStack[]=new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack=newStack;
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

class StackEmptyException extends RuntimeException{
	public StackEmptyException(String s) {
		super(s);
	}
}