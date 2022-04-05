package com.threading;
class Foo{
	
	Foo(){
		
	}
	
	public void First(){
		System.out.println("first");
	}
	
	public void Second(){
		System.out.println("Second");
	}
	
	public void Third(){
		System.out.println("Third");
	}
}
public class CallInOrder extends Thread{
	public static void main(String x[]) throws InterruptedException{
		final Foo f = new Foo();
		
		Thread t1 = new Thread(){
			public void run(){
				f.First();
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				f.Second();
			}
		};
		Thread t3 = new Thread(){
			public void run(){
				f.Third();
			}
		};
		t1.start();
	//	t1.join();
		t2.start();
		//t2.join();
		t3.start();
	//	t3.join();
	}
}
