package thread.multi_tasking;
class Section1 extends Thread{
	public void run() {
		System.out.println("Hello " + Thread.currentThread().getName());
	}
}

class Section2 extends Thread{
	public void run() {
		System.out.println("Hello " + Thread.currentThread().getName());
	}
}

public class MultiTaskThreadDemo {

	public static void main(String[] args) {
		Section1 t1 = new Section1();
		Section2 t2 = new Section2();
		
		t1.start();
		t2.start();
	}

}
