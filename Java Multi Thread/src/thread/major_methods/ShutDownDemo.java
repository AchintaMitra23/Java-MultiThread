package thread.major_methods;

public class ShutDownDemo extends Thread{

	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		run.addShutdownHook(new Thread(){
			public void run() {
				System.out.println("Shut down hook task is completed...");
			}
		});
		System.out.println("Now main sleeping press ctrl+c to exit...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
