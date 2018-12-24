package multiThreading1;

import java.util.LinkedList;
import java.util.List;

public class ProducerConsumerWaitNotify {
	public static void main(String[] args) {
		List<Integer> taskQueue=new LinkedList<Integer>();
		int maxCapacity=5;
		Thread t1=new Thread(new Producer(taskQueue,maxCapacity),"producer");
		Thread t2=new Thread(new Consumer(taskQueue),"consumer");
		t1.start();
		t2.start();
	}

}

class Producer implements Runnable{
	List<Integer> taskQueue;
	int maxCapacity;
	public Producer(List<Integer> taskQueue,int maxCapacity) {
		this.taskQueue=taskQueue;
		this.maxCapacity=maxCapacity;
	}
	public void run() {
		int counter=0;
		while(true) {
			try {
				produce(counter++);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	private void produce(int i) throws InterruptedException {
		synchronized (taskQueue) {
			while(taskQueue.size()==maxCapacity) {
				System.out.println("Queue is full"+Thread.currentThread().getName()+" is waiting, size"+taskQueue.size());
				taskQueue.wait();
			}
			Thread.sleep(1000);
			taskQueue.add(i);
			System.out.println("Produced: "+i);
			taskQueue.notify();
		}		
	}	
}

class Consumer implements Runnable{
	List<Integer> taskQueue;
	public Consumer(List<Integer> taskQueue) {
		this.taskQueue=taskQueue;
	}
	public void run() {
		while(true) {
			try {
				consume();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	private void consume() throws InterruptedException {
		synchronized (taskQueue) {
			while(taskQueue.isEmpty()) {
				System.out.println("Queue is empty "+Thread.currentThread().getName()+" is waiting size"+taskQueue.size());
				taskQueue.wait();
			}
			Thread.sleep(1000);
			System.out.println("Consumed: "+taskQueue.remove(0));
			taskQueue.notify();
		}
	}
	
	
	
	
	
}