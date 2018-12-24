package multiThreading1;

class MyThread extends Thread{
	public void run() {
		System.out.println("current thread = "+Thread.currentThread().getName());
		System.out.println("in run() method");
	}
}

public class ThreadCreation2 {

	public static void main(String[] args) {
		MyThread mythread=new MyThread();
		mythread.start();
		System.out.println("thread in main() = "+Thread.currentThread().getName());
	}

}
