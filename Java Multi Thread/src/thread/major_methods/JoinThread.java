package thread.major_methods;

public class JoinThread extends Thread{
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		JoinThread jt1 = new JoinThread();
		JoinThread jt2 = new JoinThread();
		JoinThread jt3 = new JoinThread();
		
		jt1.start();
		try {
			//jt1.join();
			jt1.join(1500); 	// requires 1500 msec to stop the thread.....
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		jt2.start();
		jt3.start();
	}

}
