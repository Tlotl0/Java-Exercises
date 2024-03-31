package Week01;

//Threads created using a thread class
public class Question07 {
	public static void main(String... args) {
		//new counter thread objects created from CounterThread class
		CounterThread thr1 = new CounterThread();
		CounterThread thr2 = new CounterThread();
		CounterThread thr3 = new CounterThread();
		CounterThread thr4 = new CounterThread();
		
		/*execution of run() method from CounterThread() class creates a start() body
		  in the thr variables
		 */
		thr1.start();
		thr2.start(); //without the join method both threads run/close at same time
		try {
			thr2.join();
			System.out.println(Thread.currentThread().getName() + " has been "
					+ "ended its run");
		} catch (Exception e) {
			System.out.println("Exception has been caught" + e);
		}
		
		thr3.start(); 
		/* Thread thr3 only initialized after thr2 is complete with its processes due 
		   to the join() method being called 
		 */
		try {
			thr3.join();
			System.out.println(Thread.currentThread().getName() + " has been "
					+ "put on hold");
		} catch (Exception e) {
			System.out.println("Exception has been caught" + e);
		}
		thr4.start();
	}
}
