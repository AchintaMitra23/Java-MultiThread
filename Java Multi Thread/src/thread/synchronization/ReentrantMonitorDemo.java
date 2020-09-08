package thread.synchronization;
// Java monitors are reentrant means java thread can reuse the same monitor for different synchronized methods if method is called from the method.
class Reentrant {
	synchronized void m() {
		n();
		System.out.println("m() called...");
	}
	synchronized void n() {
		System.out.println("n() called...");
	}
}
public class ReentrantMonitorDemo {

	public static void main(String[] args) {
		final Reentrant ren = new Reentrant();
		Thread t1 = new Thread() {
			public void run() {
				ren.m();
			}
		};
		t1.start();
	}

}
