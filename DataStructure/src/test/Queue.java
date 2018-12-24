package test;

public class Queue {
	int queuerep[];
	int size,front,rear;
	private static final int CAPACITY=5;
	 public Queue() {
		 queuerep=new int[CAPACITY];
		 size=0;front=0;rear=0;
	 }
	 
	 public Queue(int cap) {
		 queuerep=new int[cap];
		 size=0;front=0;rear=0;
	 }
	 
	 public void enQueue(int data) {
		 if(size==CAPACITY) {
			 throw new IllegalStateException("Queue is full: Overflow");
		 }else {
			 size++;
			 queuerep[rear]=data;
			 rear=(rear+1)%CAPACITY;
		 }
	 }
	 
	 public int deQueue() {
		 if(size==0) {
			 throw new IllegalStateException("Queue is empty: Underflow");
		 }else {
			 size--;
			 int data=queuerep[front];
			 queuerep[front]=Integer.MIN_VALUE;
			 front=(front+1)%CAPACITY;
			 return data;
		 }
	 }
	 public boolean isEmpty(){
		 return (size==0);
	 }
	 public boolean isFull() {
		 return (size==CAPACITY);
	 }
	 public int size() {
		 return size;
	 }
	 
	 public String toString() {
		 String result="[";
		 for(int i=0;i<size;i++) {
			 result+=Integer.toString(queuerep[(front+i)%CAPACITY]);
			 if(i<size-1) {
				 result+=", ";
			 }
		 }
		 result+="]";
		 return result;
				 
	 } 
	

	public static void main(String[] args) {
		Queue queue=new Queue();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		System.out.println(queue.deQueue());
		System.out.println(queue);
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
		System.out.println(queue.size());
		
			
	}

}
