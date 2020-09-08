package thread.multi_tasking;

class SectionA implements Runnable {

	public void run() {
		System.out.println("Hello " + Thread.currentThread().getName());
	}
	
}

class SectionB implements Runnable {

	public void run() {
		System.out.println("Hello " + Thread.currentThread().getName());
	}
	
}

public class MultiTaskRunnableDemo {

	public static void main(String[] args) {
		SectionA s1 = new SectionA();
		Thread t1 = new Thread(s1);
		
		SectionB s2 = new SectionB();
		Thread t2 = new Thread(s2);
		
		t1.start();
		t2.start();
	}

}
