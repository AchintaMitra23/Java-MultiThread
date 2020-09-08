package thread.interrupt;

public class InterruptDoesntStopWorking extends Thread {
	
	public void run() {
		try {
			Thread.sleep(500);
			System.out.println("Running");
		} catch (InterruptedException e) {
			System.out.println("Exception Handled... " + e);
		}
		System.out.println("Thread is ruuning");
	}

	public static void main(String[] args) {
		InterruptDoesntStopWorking it = new InterruptDoesntStopWorking();
		it.start();
		it.interrupt();
	}

}
