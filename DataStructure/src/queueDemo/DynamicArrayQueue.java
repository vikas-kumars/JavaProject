package queueDemo;

public class DynamicArrayQueue {
	//array used to implement the queue
	private int[] queueRep;
	private int size,front,rear;

	//length of the array used to implement the queue
	private static  int CAPACITY=4; //Default queue size
	public static int MINCAPACITY=1<<15;   //Power of2
	//Intialize the queue to use an array of default length
	public DynamicArrayQueue() {
		queueRep=new int[CAPACITY];
		size=0;front=0;rear=0;
	}

	//Intialize the queue to use an array of given length
	public DynamicArrayQueue(int cap) {
		queueRep=new int[cap];
		size=0;front=0;rear=0;
	}

	public void enQueue(int data)throws NullPointerException, IllegalStateException {
		if(size==CAPACITY)
			expand();

		size++;
		queueRep[rear]=data;
		rear=(rear+1)%CAPACITY;
	}

	private void expand() {
		int length=size();
		//length=length<<1;
		int[] newQueue =new int[length<<1];//or length*2
		//copy items
		for(int i=front;i<size;i++) {
			newQueue[i-front]=queueRep[i%CAPACITY];
		}
		queueRep=newQueue;
		front=0;
		rear=size;
		CAPACITY*=2;
	}

	//Remove the front element from the queue.This method
	// runs in O(1) time
	public int deQueue() throws IllegalStateException{
		int data;
		//Effect: if queue is empty, throw illegalStateException,
		//else remove and return oldest element of this
		if(size==0) {
			throw new IllegalStateException("Queue is Empty: Underflow");
		}else {
			size--;
			data=queueRep[(front%CAPACITY)];
			queueRep[front]=Integer.MIN_VALUE;
			//System.out.println(queueRep[front]);
			front=(front+1)%CAPACITY;
		}
		return data;
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

	/*private void shrink() {
		int length=size;
		if(length<MINCAPACITY) 
			length=MINCAPACITY;
		int[] newQueue=new int[length];
		System.arraycopy(queueRep, 0, newQueue, 0, length);
		queueRep=newQueue;
	}*/

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
		DynamicArrayQueue dq=new DynamicArrayQueue();
		dq.enQueue(1);
		dq.enQueue(2);
		dq.enQueue(3);
		dq.enQueue(4);
		System.out.println(dq);
		dq.enQueue(5);
		dq.enQueue(6);
		dq.enQueue(7);
		dq.enQueue(8);
		dq.enQueue(9);
		dq.deQueue();
	}

}

