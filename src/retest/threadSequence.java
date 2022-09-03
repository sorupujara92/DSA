package retest;

public class threadSequence extends Thread{
	String name;
	static Integer count=1;
	Integer difference;
	Object obj = new Object();
	Integer count1=1;
	threadSequence(String name,Integer difference){
		this.name=name;
		this.difference=difference;
	}
	
	public static void main(String x[]){
		threadSequence t1 = new threadSequence(" Thread 1 ",1);
		threadSequence t2 = new threadSequence(" Thread 2 ",2);
		threadSequence t3 = new threadSequence(" Thread 3 ",0);
		t1.start();
		t2.start();
		t3.start();
	}
	
	public void run(){
		while(count<10) {
			try{
				//synchronized (obj) {
					
			
					if(count%3==this.difference){
						System.out.println(this.name+count);
						System.out.println(count1);
						count++;
				//		count++;
						//obj.notifyAll();
					}else{
						//obj.wait();
					}
		//		}
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
	
}
