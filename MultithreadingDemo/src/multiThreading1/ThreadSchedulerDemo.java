package multiThreading1;

class MyRunn implements Runnable{
	public void run() {
		System.out.println("in run() method");
		for(int i=0;i<5;i++) {
			System.out.println("i="+i+", ThreadName= "+Thread.currentThread().getName());
		}
	}
}

public class ThreadSchedulerDemo {

	public static void main(String[] args) {
		System.out.println("in main() method");
		Thread t1=new Thread(new MyRunn(),"Thread-1");
		Thread t2=new Thread(new MyRunn(),"Thread-2");
		t1.start();
		t2.start();
		System.out.println("end of main() method");
	}

}
