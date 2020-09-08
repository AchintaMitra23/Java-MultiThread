package thread.creation;

public class RunnableInterfaceDemo implements Runnable{

	public static void main(String[] args) {
		RunnableInterfaceDemo rid = new RunnableInterfaceDemo();
		Thread t1 = new Thread(rid);
		t1.start();
	}

	public void run() {
		System.out.println("RunnableInterface is running...");
	}

}
