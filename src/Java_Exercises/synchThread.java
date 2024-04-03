package Java_Exercises;


public class synchThread extends Thread {
	Table t;
	public synchThread(Table t) {
		this.t = t;
	}

	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() 
					+ " has started its run");
			Thread.sleep(200);
			t.Multiplier(5);
		} catch (Exception e) {
			System.out.println("Exception Reached: " + e);
		  }
		System.out.println(Thread.currentThread().getName() 
				+ " has ended its run");
}

}