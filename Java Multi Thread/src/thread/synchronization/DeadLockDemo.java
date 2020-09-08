package thread.synchronization;

public class DeadLockDemo {

	public static void main(String[] args) {
		final String str1 = "Hi", str2 = "Bye";
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized (str1) {
					System.out.println("Thread1 : locked str1");
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (str2) {
					System.out.println("Thread1 : locked str2");
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				synchronized (str2) {
					System.out.println("Thread2 : locked str2");
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (str1) {
					System.out.println("Thread2 : locked str1");
				}
			}
		};
		t1.start();
		t2.start();
	}

}
