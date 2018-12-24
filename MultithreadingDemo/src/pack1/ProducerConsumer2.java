package pack1;

import java.util.LinkedList;
import java.util.List;

public class ProducerConsumer2 {

	public static void main(String[] args) throws InterruptedException {
		Producers produce=new Producers();
		Consumers consumer=new Consumers(produce);
		  Thread prodThread=new Thread(produce,"prodThread");
          Thread consThread=new Thread(consumer,"consThread");
          
          consThread.start();     //start consumer thread.
          Thread.sleep(100);      //This minor delay will ensure that consumer thread starts before producer thread.
          prodThread.start();     //start producer thread.
          
          
		
	}

}
class Producers implements Runnable{
	List<Integer> sharedQueue;

	public Producers() {
		sharedQueue=new LinkedList<Integer>();
	}
	
	public void run() {
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				sharedQueue.add(i);
				System.out.println("Producer is still producing, Produced: "+i);
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Production is over consumer can consume");
		    this.notify();
		}
	}
}

class Consumers implements Runnable{
	Producers pro;
	public Consumers(Producers pro) {
		this.pro=pro;
	}
	public void run() {
		synchronized (pro) {
			System.out.println("consumer is waiting for production to get over");
			try {
				pro.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		//System.out.println("hello");
		int productsize=pro.sharedQueue.size();
		for(int i=0;i<productsize;i++) {
			System.out.println("CONSUMED : "+pro.sharedQueue.remove(0) +" ");
			//Thread.sleep(1000);
		}
	}
}
