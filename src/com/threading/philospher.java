package com.threading;

import java.util.concurrent.locks.ReentrantLock;

class chopStick{
	public ReentrantLock lock;
	String chopStick;
	chopStick(String chopStick){
		this.chopStick= chopStick;
		lock = new ReentrantLock();

	}
	
}
public class philospher implements Runnable{

	String name;
	chopStick left;
	chopStick right;
	Integer sleep;
	
	philospher(String name,chopStick left , chopStick right,Integer sleep){
		this.name=name;
		this.left=left;
		this.right=right;
		this.sleep = sleep;
	}
	
	
	public static void main(String x[]){
		chopStick c1 = new chopStick("C1");
		chopStick c2 = new chopStick("C2");
		chopStick c3 = new chopStick("C3");
		chopStick c4 = new chopStick("C4");
		chopStick c5 = new chopStick("C5");
		
		philospher p1 = new philospher("P1",c1,c5,3000);
		philospher p2 = new philospher("P2",c2,c1,4000);
		philospher p3 = new philospher("P3",c5,c4,5000);
		philospher p4 = new philospher("P4",c3,c2,7000);
		philospher p5 = new philospher("P5",c4,c3,6000);
		
		Thread t1 = new Thread(p1);
		t1.start();
		
		Thread t2 = new Thread(p2);
		t2.start();
		
		Thread t3 = new Thread(p3);
		t3.start();
		
		Thread t4 = new Thread(p4);
		t4.start();
		
		Thread t5 = new Thread(p5);
		t5.start();
		
	}


	@Override
		public void run() {
		while(true){
			try{
				Thread.currentThread().sleep(this.sleep);
				if(this.left.lock.tryLock()){
					System.out.println("Philospher "+this.name+" picked "+this.left.chopStick);
				}else{
					synchronized (this.left.lock) {
						this.left.lock.wait();
					}
					
				}
				if(this.right.lock.tryLock()){
					System.out.println("Philospher "+this.name+" picked "+this.right.chopStick);
				}else{
					System.out.println("Philospher "+this.name+" not available "+this.right.chopStick+" so left "+this.left.chopStick);
		
					synchronized (this.left.lock) {
						this.left.lock.unlock();
					}
				}
			}	
			catch(Exception e){
				System.out.println(e);
				e.printStackTrace();
			}
			finally{
				if(this.left.lock.isHeldByCurrentThread()){
					this.left.lock.unlock();
					System.out.println("Philospher "+this.name+" going to leave chop "+this.left.chopStick);
					synchronized (this.left.lock) {
						this.left.lock.notifyAll();
					}
		
				}
				if(this.right.lock.isHeldByCurrentThread()){
					this.right.lock.unlock();
					System.out.println("Philospher "+this.name+" going to leave chop  "+this.right.chopStick);
					synchronized (this.right.lock) {
						this.right.lock.notifyAll();
					}
		
				}
			}

		}
		}
}
