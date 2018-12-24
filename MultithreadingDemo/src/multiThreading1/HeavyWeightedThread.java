package multiThreading1;

/* Threads are lightweight process only if threads of same process 
   are executing concurrently. But if threads of different processes
   are executing concurrently then threads are heavy weight process.*/


/* Threads as heavy weight process : In the below program we will 
 * create Thread-1 and Thread-2 on different processes i.e. on MyRunnable1
 *  and MyRunnable2.*/

class MyRunnable1 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("i= "+i+",ThreadName= "+Thread.currentThread().getName());
		}
	}
}

class MyRunnable2 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("i= "+i+",ThreadName= "+Thread.currentThread().getName());
		}
	}
}

public class HeavyWeightedThread {

	public static void main(String[] args) {
		Thread t1=new Thread(new MyRunnable1(),"Thread-1");
		Thread t2=new Thread(new MyRunnable2(),"Thread-2");
		t1.start();
		t2.start();
	}

}
