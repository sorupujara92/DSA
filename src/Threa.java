import java.util.concurrent.locks.Lock;


public class Threa implements Runnable{

	int n=3;
	int m=10;
	int remainder;
	static int count=1;
	
	public Threa(int remainder){
		this.remainder = remainder;
	}
	  Object l = new Object();
	@Override
	public void run() {
		
		while(count<=m){
			synchronized(l){
				System.out.println(Thread.currentThread().getName()+"in snbc bloxk");
		while(count%3!=remainder)	{
			
			try {
				l.wait();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			
				System.out.println(Thread.currentThread().getName()+" "+count);
				count++;
					notifyAll();
				
			}
		
		}
	}
	
	public static void main(String x[]){
		Threa t[] = new Threa[3];
		Thread t1[] = new Thread[3];
		
		for(int i=0;i<3;i++){
			if(i!=2){
			t[i] = new Threa((i+1));
			}else{
				t[i] = new Threa(0);

			}
			t1[i] = new Thread(t[i]);
			t1[i].setName("Thread "+(i+1));
			
		}
		
		t1[0].start();
		t1[1].start();
		t1[2].start();

	}
	
}
