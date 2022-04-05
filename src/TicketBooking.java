import java.util.concurrent.Semaphore;

class ticket{
	int id;
	ticket(int id){
		this.id = id;
	}
	int tickets =5;
}
public class TicketBooking extends Thread{
	String name;
	TicketBooking(String name){
		this.name = name;
	}
	static Semaphore semaphore = new Semaphore(1);

	public static void main(String x[]){
		TicketBooking t1 = new TicketBooking("soru");
		TicketBooking t2 = new TicketBooking("anu");
		TicketBooking t3 = new TicketBooking("rahul");
		t1.start();
		t2.start();
		t3.start();
	}
	
	public void run(){
		
		try {
			System.out.println("going to acuire"+Thread.currentThread().getName());
			semaphore.acquire();
			Thread.currentThread().sleep(1000);
			System.out.println("acqiired"+Thread.currentThread().getName());
			Thread.currentThread().sleep(1000);

			semaphore.release();
			System.out.println("released"+Thread.currentThread().getName());

			Thread.currentThread().sleep(10000
					);


		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
