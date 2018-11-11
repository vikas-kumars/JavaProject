package java2nvoice;

public class Deadlock1 {
	String str1="Java";
	String str2="Unix";
	Thread tr1=new Thread("My Thread 1") {
	public void run() {
		while(true) {
			synchronized (str1) {
				synchronized (str2) {
					System.out.println(str1+str2);					
				}				
			}
		}
	}
	};
	Thread tr2=new Thread("My Thread 2") {
		public void run() {
			while(true) {
				synchronized (str1) {
					synchronized (str2) {
						System.out.println(str1+str2);						
					}					
				}
			}
		}
	};
	public static void main(String[] args) {
		Deadlock1 d1=new Deadlock1();
		d1.tr1.start();
		d1.tr2.start();
	}
}
