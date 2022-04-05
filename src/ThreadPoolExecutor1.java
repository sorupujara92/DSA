import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor;
class CallableThread implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		System.out.println("inside callable"+Thread.currentThread().getName());
		return 1;
	}
	
	public String toString(){
        return Thread.currentThread().getName();
    }
	
}
 class RejectedExecutionHandlerImpl implements RejectedExecutionHandler {

   

	@Override
	public void rejectedExecution(Runnable r,
			java.util.concurrent.ThreadPoolExecutor executor) {
        System.out.println(r.toString() + " is rejected");
		
	}

}


public class ThreadPoolExecutor1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RejectedExecutionHandlerImpl rejectionHandler = new RejectedExecutionHandlerImpl();
		ThreadFactory threadFactory = Executors.defaultThreadFactory();
		ThreadPoolExecutor  tpes = new ThreadPoolExecutor(2,4,10,TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2),rejectionHandler);
		
		for(int i=0;i<10;i++){
			CallableThread ct = new CallableThread();
			tpes.submit(ct);
		}
		
		tpes.shutdown();
	}
}
