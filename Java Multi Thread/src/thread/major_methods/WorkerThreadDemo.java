package thread.major_methods;

class WorkerThreadDemo implements Runnable{
	private String str;
	
	public WorkerThreadDemo(String str) {
		super();
		this.str = str;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Starts Message: " + str);
		processMessage();
		System.out.println(Thread.currentThread().getName() + " Ends");
	}

	private void processMessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
