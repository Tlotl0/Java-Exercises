package Java_Exercises;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

public class DLThread implements Runnable {
	String name;
	ReentrantLock rLock;
	public DLThread(ReentrantLock rl, String n) {
		rLock = rl;
		name = n;
	}
	
	public void run() {

		boolean done = false;
		while (!done) {
				if (rLock.tryLock()) {
					try {
						Date d = new Date();
						SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
						System.out.println("Task Name: " + name + " Outer lock "
								+ "acquired at " + ft.format(d) 
								+ " ......Doing work");
						Thread.sleep(1500);
						
						
						//accessing the inner lock
						rLock.lock();
						try {
							 d = new Date();
							 ft = new SimpleDateFormat("hh:mm:ss");
							System.out.println("Task Name: " + name + " Outer lock at "
									+ ft.format(d) + " Doing work");
							System.out.println(Thread.currentThread().getName());
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						} finally {
							System.out.println("Task name: " + name + " releasing "
									+ " inner lock");
	
							rLock.unlock();
							
						}
						// deadlock  created
						System.out.println("Lock Hold Count: " + 
						rLock.getHoldCount());
						System.out.println("Task Name: " + name + " work done");
						
						done = true;
						
					}catch (InterruptedException e) {
						e.printStackTrace();
					} finally {
						System.out.println("Task name: " + name + " releasing "
								+ "outer lock");
						//outer lock released
						rLock.unlock();
						System.out.println("Lock hold count: " + 
						rLock.getHoldCount());
					}

				} else {
					System.out.println("Task name: " + name + " Waiting for lock");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				  }
				}
	}
	
}
