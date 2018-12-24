package multiThreading1;

public class SynchronizationPerformance implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is waiting for lock");
		synchronized (this) {
			try {
				System.out.println(Thread.currentThread().getName()+" has acquired lock ");
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" has ended");
		}
	}

	public static void main(String[] args) {
		SynchronizationPerformance obj=new SynchronizationPerformance();
		 Thread thread1=new Thread(obj,"Thread-1");
	        Thread thread2=new Thread(obj,"Thread-2");
	        
	        thread1.start();
	        thread2.start();
	}

}
