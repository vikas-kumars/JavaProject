package queueDemo;

public class FixedSizeArrayQueue {
	//array used to implement the queue
	private int[] queueRep;
	private int size,front,rear;
	
	//length of the array used to implement the queue
	private static final int CAPACITY=5; //Default queue size
	//Intialize the queue to use an array of default length
	public FixedSizeArrayQueue() {
		queueRep=new int[CAPACITY];
		size=0;front=0;rear=0;
	}
	
	//Intialize the queue to use an array of given length
	public FixedSizeArrayQueue(int cap) {
		queueRep=new int[cap];
		size=0;front=0;rear=0;
	}
	
	public void enQueue(int data)throws NullPointerException, IllegalStateException {
		if(size==CAPACITY)
			throw new IllegalStateException("Queue is full: Overflow");
		else {
			size++;
			queueRep[rear]=data;
			rear=(rear+1)%CAPACITY;
		}
	}
	
	//Remove the front element from the queue.This method
	// runs in O(1) time
	public int deQueue() throws IllegalStateException{
		//Effect: if queue is empty, throw illegalStateException,
		//else remove and return oldest element of this
		if(size==0) {
			throw new IllegalStateException("Queue is Empty: Underflow");
		}else {
			size--;
			int data=queueRep[(front%CAPACITY)];
			queueRep[front]=Integer.MIN_VALUE;
			//System.out.println(queueRep[front]);
			front=(front+1)%CAPACITY;
			return data;
		}
	}
	//Check whether the queue is empty. This method run in O(1) time.
	public boolean isEmpty() {
		return (size==0);
	}
	
	//Check whether the queue is full. This method runs in O(1) time
	public boolean isFull() {
		return (size==CAPACITY);
	}
	
	//Return the number of the element in the queue.this method run in O(1) time.
	public int size() {
		return size;
	}
	
	//Return the string representation of the queue as as a list of element, with
	//the front element at the end:[...,prev,rear].This method return in O(n)time
	//Where n is the size of the queue
	
	public String toString() {
		String result="[";
		for(int i=0;i<size;i++) {
			result+= Integer.toString(queueRep[(front+i)%CAPACITY]);
			if(i<size-1) {
				result+=", ";
			}
		}
		result +="]";
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedSizeArrayQueue f=new FixedSizeArrayQueue();
		f.enQueue(1);
		System.out.println(f.front+" "+f.rear);
		f.enQueue(4);
		System.out.println(f.front+" "+f.rear);

		f.enQueue(5);
		System.out.println(f.front+" "+f.rear);
		f.enQueue(2);
		System.out.println(f.front+" "+f.rear);
		f.enQueue(3);
		System.out.println(f.front+" "+f.rear);
		f.deQueue();
		System.out.println(f.front+"="+f.rear);
		//f.enQueue(6);
		f.enQueue(7);
		System.out.println(f.front+" "+f.rear);
		System.out.println(f.size());
		System.out.println(f.isEmpty());
		System.out.println(f.isFull());
		System.out.println(f);

	}

}
