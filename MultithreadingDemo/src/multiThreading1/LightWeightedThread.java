package multiThreading1;

/* Threads as light weight process : In the below program we
 *  will create Thread-1 and Thread-2 on same process i.e. on 
 *  MyRunnable. */

class MyRunnable implements Runnable {
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("i="+i+" ,ThreadName="+Thread.currentThread().getName());
		}
	}
}
public class LightWeightedThread {

	public static void main(String[] args) {
		Thread t1=new Thread(new MyRunnable(),"Thread-1");
		Thread t2=new Thread(new MyRunnable(),"Thread-2");
		t1.start();
		t2.start();
	}

}
