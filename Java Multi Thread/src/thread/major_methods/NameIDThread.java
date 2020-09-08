package thread.major_methods;

public class NameIDThread extends Thread{
	
	public void run() {
		System.out.println("Running Thread Name is : " + Thread.currentThread().getName());
		System.out.println("Running Thread Priority is : " + Thread.currentThread().getPriority());
		
		// Check which one is the daemon thread and that is running...
		if (Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName() + " is now daemon that is running.");
		} else {
			System.out.println(Thread.currentThread().getName() + " is normal thread that is running.");
		}
	}

	public static void main(String[] args) {
		NameIDThread nt1 = new NameIDThread();
		NameIDThread nt2 = new NameIDThread();
		System.out.println("Name of nt1 : " + nt1.getName());
		System.out.println("Name of nt2 : " + nt2.getName());
		System.out.println("ID of nt1 : " + nt1.getId());
		System.out.println("ID of nt2 : " + nt2.getId());
		System.out.println("Priority of nt1 : " + nt1.getPriority());
		System.out.println("Priority of nt2 : " + nt2.getPriority());
		
		// Set Priority of each threads...
		nt1.setPriority(Thread.MIN_PRIORITY);
		nt2.setPriority(Thread.MAX_PRIORITY);
		
		// Make first thread as daemon thread...
		nt1.setDaemon(true);
		
		// Start both threads...
		nt1.start();
		nt2.start();
		
		nt1.setName("Achinta");
		System.out.println("Modified Name of nt1 : " + nt1.getName());
		nt2.setName("Nilanjana");
		System.out.println("Modified Name of nt12 : " + nt2.getName());
		
	}

}
//Note: Making a thread as a daemon should be done before start the thread... otherwise will give an error... 
