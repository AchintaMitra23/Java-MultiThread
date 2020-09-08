package thread.creation;

public class ThreadSleepDemo extends Thread{

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("Thread is now sleeping for 500msec");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		ThreadSleepDemo tsd1 = new ThreadSleepDemo();
		ThreadSleepDemo tsd2 = new ThreadSleepDemo();
		
		tsd1.start();
		tsd2.start();
	}

}
