package thread.synchronization;

class Patient {
	void print(String str) {
		synchronized(this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(str);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class MThreadA extends Thread {
	public Patient p1;

	public MThreadA(Patient p1) {
		super();
		this.p1 = p1;
	}
	
	public void run() {
		p1.print("Hi");
	}
	
}
class MThreadB extends Thread {
	public Patient p2;

	public MThreadB(Patient p2) {
		super();
		this.p2 = p2;
	}
	
	public void run() {
		p2.print("Bye");
	}
	
}

public class SynchronizedBlockDemo {

	public static void main(String[] args) {
		Patient pt = new Patient();
		MThreadA t1 = new MThreadA(pt);
		MThreadB t2 = new MThreadB(pt);
		
		t1.start();
		t2.start();
	}

}
