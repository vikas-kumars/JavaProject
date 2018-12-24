package pack1;

public class TicketBooking {

	public static void main(String[] args) {
		MyBooking my=new MyBooking();
		Thread t1=new Thread(my,"Passenger1Thread");
		Thread t2=new Thread(my,"Passenger2Thread");
		t1.start();
		t2.start();
	}

}

class MyBooking implements Runnable{
    int ticketAvailable=1;
	public void run() {
		System.out.println("Waiting to book ticket for: "+Thread.currentThread().getName());
		if(ticketAvailable>0) {
			System.out.println("Booking ticket for: "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}catch(Exception e) {

			}
			ticketAvailable--;
			System.out.println("Ticket booked for: "+Thread.currentThread().getName());
			System.out.println("Currently ticket availabel: "+ticketAvailable);
		}
		else {
			System.out.println("Ticket NOT BOOKED for : "+ Thread.currentThread().getName());
		}
	}
}
