package thread.creation;

public class ThreadClassDemo extends Thread{
	/*
	 * ********** Thread Constructors **************
	 * Thread()
	 * Thread(String name)
	 * Thread(Runnable r)
	 * Thread(Runnable r, String name) 
	 */
	
	public void run() {
		System.out.println("ThreadClassDemo is running...");
	}

	public static void main(String[] args) {
		ThreadClassDemo tcd = new ThreadClassDemo();
		tcd.start();
	}

}
