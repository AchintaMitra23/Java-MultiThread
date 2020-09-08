package thread.major_methods;

public class ThreadGroupDemo implements Runnable{
	/*
	 * **************** Constructors **************
	 * ThreadGroup(String name)
	 * ThreadGroup(ThreadGroup parent, String name)
	 */
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadGroupDemo tgd1 = new ThreadGroupDemo();
		ThreadGroup tg1 = new ThreadGroup("Parent Thread");
		
		Thread t1 = new Thread(tg1, tgd1, "One");
		t1.start();
		Thread t2 = new Thread(tg1, tgd1, "Two");
		t2.start();
		Thread t3 = new Thread(tg1, tgd1, "Three");
		t3.start();
		System.out.println("Thread froup name : " + tg1.getName());
		tg1.list();
	}

}
