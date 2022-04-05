
public class oddEvenThread{
	static Integer count = 1;
	static Integer number = 20;
	static Object lock = new Object();
	public static void main(String x[]){
		
		
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				
				while(count<=number){
					
					synchronized(lock){
					while(count%2!=0){
						try {
							lock.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					System.out.println("T2 "+count);
					count++;
					lock.notifyAll();
					}
				}
			}

		});
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				
				while(count<=number){
					
					synchronized(lock){
					while(count%2==0){
						try {
							lock.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					System.out.println("T1 "+count);
					count++;
					lock.notifyAll();
					}
				}
			}

		});
		
		t1.start();
		t2.start();
	}
	
}
