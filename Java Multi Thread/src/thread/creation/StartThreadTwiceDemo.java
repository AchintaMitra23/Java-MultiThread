package thread.creation;

public class StartThreadTwiceDemo extends Thread{

	public void run() {
		System.out.println("Thread running twice...");
	}
	// IllegalThreadStateException shows
	public static void main(String[] args) {
		StartThreadTwiceDemo t1 = new StartThreadTwiceDemo();
		t1.start();
		t1.start();
	}

}
