package thread.synchronization;

class House {
	synchronized static void print(String str) {
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

class MThreadI extends Thread {
	public void run() {
		House.print("Hi");
	}
	
}
class MThreadII extends Thread {
	public void run() {
		House.print("Bye");
	}
	
}


public class SynchronizationStaticDemo {

	public static void main(String[] args) {
		MThreadI t1 = new MThreadI();
		MThreadII t2 = new MThreadII();
		
		t1.start();
		t2.start();
	}

}
