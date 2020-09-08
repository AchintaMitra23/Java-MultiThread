package thread.multi_tasking;

import java.io.IOException;

public class RunTimeDemo {

	public static void main(String[] args) throws IOException {
		Runtime run = Runtime.getRuntime();
		System.out.println("Total memory : " + run.totalMemory());
		System.out.println("Free memory : " + run.freeMemory());
		System.out.println("Available Proccessors : " + run.availableProcessors());
		//run.exec("notepad");
		run.exit(0);
	}

}
