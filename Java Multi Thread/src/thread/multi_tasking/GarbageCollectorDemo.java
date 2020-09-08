package thread.multi_tasking;

public class GarbageCollectorDemo {
	protected void finalize() {
		System.out.println("Object is garbage collected");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*Runtime run = Runtime.getRuntime();
		run.gc();*/
		GarbageCollectorDemo g1 = new GarbageCollectorDemo();
		GarbageCollectorDemo g2 = new GarbageCollectorDemo();
		g1 = null;
		g2 = null;
		System.gc();
	}
}
