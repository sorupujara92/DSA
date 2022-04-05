import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

 class RunnableThread implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		//try{
		System.out.println("in side call");
		int a=2/0;
		//throw new NullPointerException();
		System.out.println("cooldude");
	//	}catch(Exception e){
	//		e.printStackTrace();
		//	System.out.println(e);
	//	}
		return 1;
	}
 
}


public class ThreadTest {

 public static void main(String args[]){
 RunnableThread rt = new RunnableThread();
 ExecutorService et = Executors.newFixedThreadPool(2);
 try{
 Future<Integer> result = et.submit(rt);
 
 }catch(Exception e){
	 System.out.println(e);
 }
 System.out.println("cool");
 et.shutdown();
 
 }
}