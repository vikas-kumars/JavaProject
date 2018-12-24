package pack1;

import java.util.LinkedList;
import java.util.List;

public class ProducerConsumerWithoutWaitNotify {

	public static void main(String[] args) {
		Produce produce=new Produce();
		Consume consume=new Consume(produce);
		Thread t1=new Thread(produce,"producerThread");
		Thread t2=new Thread(consume,"consumerThread");
		t2.start();
		t1.start();
	}

}

class Produce implements Runnable{
	List<Integer> ll=new LinkedList();
	boolean productionInProcess=true;
	public Produce() {		
	}
	
	public void run() {
		for(int i=1;i<=10;i++) {
			ll.add(i);
			System.out.println("Producer is still producing Produced: "+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		productionInProcess=false;
	}
	
}

class Consume implements Runnable{
	Produce pro;
	public Consume(Produce produce) {
		this.pro=produce;
	}
	public void run() {
		while(pro.productionInProcess) {
			  System.out.println("Consumer waiting for production to get over.");
              try{
                  Thread.sleep(4000);
              }catch(InterruptedException e){e.printStackTrace();}
		}
		  System.out.println("Production is over, consumer can consume.");
          int productSize=pro.ll.size();
          for(int i=0;i<productSize;i++)
                 System.out.println("CONSUMED : "+ pro.ll.remove(0) +" "); 
	}
}


