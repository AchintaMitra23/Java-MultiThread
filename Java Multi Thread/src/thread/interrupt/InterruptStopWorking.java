package thread.interrupt;

public class InterruptStopWorking extends Thread {

	public void run() {
		try {
			Thread.sleep(500);
			System.out.println("Running");
		} catch (InterruptedException e) {
			throw new RuntimeException("Thread was interrupted : " + e);
		}
	}
	
	public static void main(String[] args) {
		InterruptStopWorking it = new InterruptStopWorking();
		it.start();
		try {
			it.interrupt();
		} catch(Exception e) {
			System.out.println("Exeption handled " + e);
		}
		
	}

}
