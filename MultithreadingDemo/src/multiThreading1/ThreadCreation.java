package multiThreading1;

class MyRunnables implements Runnable {
	public void run() {
		System.out.println("in run() method");
	}
}

public class ThreadCreation {

	public static void main(String[] args) {
		MyRunnables runnable=new MyRunnables();
		Thread thread=new Thread(runnable);
		thread.start();
	}

}
