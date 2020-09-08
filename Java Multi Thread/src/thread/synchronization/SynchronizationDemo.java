package thread.synchronization;

// Synchronization makes the one process completely without any preemption.
class Student {
	synchronized void print(String str) {
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

class MThread1 extends Thread {
	public Student s1;

	public MThread1(Student s1) {
		super();
		this.s1 = s1;
	}
	
	public void run() {
		s1.print("Hi");
	}
	
}
class MThread2 extends Thread {
	public Student s2;

	public MThread2(Student s2) {
		super();
		this.s2 = s2;
	}
	
	public void run() {
		s2.print("Bye");
	}
	
}
public class SynchronizationDemo {

	public static void main(String[] args) {
		Student st = new Student();
		MThread1 t1 = new MThread1(st);
		MThread2 t2 = new MThread2(st);
		
		t1.start();
		t2.start();
	}

}
