package Week01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;


//program to create a deadlock and resolve it 
public class Question09 {
	static final int maxTime = 2;
	public static void main(String... args) {
		ReentrantLock rel = new ReentrantLock();
		//executor service allows for tracking of process
		ExecutorService pool = Executors.newFixedThreadPool(maxTime);
		//Threads which create deadlock created
		Runnable wrk1 = new DLThread(rel, "Job 1");
		Runnable wrk2 = new DLThread(rel, "Job 2");
		Runnable wrk3 = new DLThread(rel, "Job 3");
		Runnable wrk4 = new DLThread(rel, "Job 4");
		//threads initialized
		pool.execute(wrk1);
		pool.execute(wrk2);
		pool.execute(wrk3);
		pool.execute(wrk4);
		pool.shutdown();
	}
}


