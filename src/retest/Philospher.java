package retest;

import java.util.concurrent.locks.ReentrantLock;

class chopsStick{
	
	String name;
	ReentrantLock lock;
	
	chopsStick(String name){
		this.name = name;
		lock = new ReentrantLock();
	}
}
public class Philospher extends Thread{

	String name;
	
	
	
	chopsStick left;
	chopsStick right;
	Integer sleep;
	Philospher(String name , chopsStick left , chopsStick right,Integer sleep){
		this.name=name;
		this.left=left;
		this.right=right;
		this.sleep=sleep;
	}
	
	public static void main(String x[]){
		
		chopsStick c1 = new chopsStick("C1");
		chopsStick c2 = new chopsStick("C2");
		chopsStick c3 = new chopsStick("C3");
		chopsStick c4 = new chopsStick("C4");
		chopsStick c5 = new chopsStick("C5");
		
		Philospher p1 = new Philospher("P1",c1,c5,3000);
		Philospher p2 = new Philospher("P2",c2,c1,4000);
		Philospher p3 = new Philospher("P3",c5,c4,5000);
		Philospher p4 = new Philospher("P4",c3,c2,7000);
		Philospher p5 = new Philospher("P5",c4,c3,6000);		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
	}
	
	public void run(){
		while(true){
		if(this.left.lock.tryLock()){
			System.out.println(this.name+" got picked chopsstick " + this.left.name);
			try {
				Thread.currentThread().sleep(this.sleep);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	else{					
			
			try {
				synchronized(this.left.lock){
					System.out.println(this.name+" is waiting for left chopsstick " + this.left.name);
					this.left.lock.wait();
					try {
						Thread.currentThread().sleep(this.sleep);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
		if(this.right.lock.tryLock()){
			System.out.println(this.name+" got picked chopsstick " + this.right.name);
			synchronized(this.left.lock){
				if(this.left.lock.isHeldByCurrentThread())
				this.left.lock.unlock();
			}	
			synchronized(this.right.lock){

				this.right.lock.unlock();
				
			}	
				System.out.println(this.name+"  leaving botht chopsstick " + this.right.name+" hence releasing left one "+ this.left.name);
				synchronized(this.left.lock){
					this.left.lock.notifyAll();
				}
				synchronized(this.right.lock){
					this.right.lock.notifyAll();
				}

				try {
					Thread.currentThread().sleep(this.sleep);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}else{
			synchronized(this.left.lock){
				if(this.left.lock.isLocked() && this.left.lock.isHeldByCurrentThread()){
					this.left.lock.unlock();
					System.out.println(this.name+"  cant pick right chopsstick " + this.right.name+" hence releasing left one "+ this.left.name);
					synchronized(this.left.lock){
						this.left.lock.notifyAll();
					}
					synchronized(this.right.lock){
						this.right.lock.notifyAll();
					}
					try {
						Thread.currentThread().sleep(this.sleep);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		
		
		
	}
	}
}
