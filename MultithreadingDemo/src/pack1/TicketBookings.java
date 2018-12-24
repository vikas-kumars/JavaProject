package pack1;
public class TicketBookings {
	public static void main(String[] args) {
		Booking obj=new Booking();
		Thread t1=new Thread(obj,"Passenger-1");
		Thread t2=new Thread(obj,"Passenger-2");
		t1.start();
		t2.start();
	}
}

class Booking implements Runnable{
	int ticketAvailable=1;
	public void run() {
		System.out.println("Wating for ticket booking: "+Thread.currentThread().getName());
		synchronized(this) {
			if(ticketAvailable>0) {
				System.out.println("Booking ticket for: "+Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				ticketAvailable--;
				System.out.println("Ticket booked for: "+Thread.currentThread().getName());
				System.out.println("Currently ticket available: "+ticketAvailable);
			}else {
				System.out.println("Ticket not avilable for: "+Thread.currentThread().getName());
			}
		}
		
	}
}
