package retest;

import java.util.concurrent.locks.ReentrantLock;

public class threeThreads extends Thread{
	static ReentrantLock  lock = new ReentrantLock();
	int number;
	String name;
	threeThreads(int number,String name){
		this.number=number;
		this.name = name;
	}
	
	static int count=1;
	public static void main(String x[]){
		
		threeThreads three[] = new threeThreads[3];
		three[0] = new threeThreads(1,"one");
		three[1] = new threeThreads(2,"two");
		three[2] = new threeThreads(0,"three");
		three[0].start();
		three[1].start();
		three[2].start();
	}
	
	public void run(){
		
		while(count<10){
			synchronized(lock){
				Integer remainder = count%3;
				if(remainder==this.number){
					System.out.println(this.name+"--"+count);
					count++;
					lock.notifyAll();
				}else{
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}
		
	}
	
}	
