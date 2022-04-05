package com.threading;

class Number{
	Integer value;
	

	Number(Integer value){
		this.value=value;
		
	}
}
public class FizzBuzz extends Thread {
	Boolean threeValue=null;
	Boolean fiveValue=null;
	Integer number;
	String msg;
	FizzBuzz(Integer number,Boolean threeValue,Boolean fiveValue,String msg){
		this.number = number;
		this.threeValue=threeValue;
		this.fiveValue=fiveValue;
		this.msg = msg;
	}
	static Integer count=1;
	public static void main(String x[]) throws InterruptedException{		
		FizzBuzz t1 = new FizzBuzz(3,true,false,"Fiz");
		
		FizzBuzz t2 = new FizzBuzz(5,false,true,"Buzz");
		FizzBuzz t3 = new FizzBuzz(15,true,true,"FizBuzz");
		FizzBuzz t4 = new FizzBuzz(null,false,false,"not div");

		t1.start();
		t2.start();

		t3.start();

		t4.start();

	}
	
	public void run(){
		while(count<20){
		synchronized(this){
				if((count%3==0)==this.threeValue && (count%5==0)==this.fiveValue){
					System.out.println(count+" is "+this.msg);
					count++;

				}

		}
		}

	}
}
