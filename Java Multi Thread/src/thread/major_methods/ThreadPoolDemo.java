package thread.major_methods;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

	public static void main(String[] args) {
		ExecutorService exc = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Runnable work = new WorkerThreadDemo("" + i);
			exc.execute(work);
		}
		exc.shutdown();
		while (!exc.isTerminated()) {
			
		}
		
		System.out.println("Finished all threads...");
	}

}
