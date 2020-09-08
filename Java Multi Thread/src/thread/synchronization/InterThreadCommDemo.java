package thread.synchronization;

class Banker {
	int amount = 1000;
	
	synchronized void withdraw(int amount) {
		System.out.println("Going to withdraw...");
		if (this.amount < amount) {
			System.out.println("Less amount");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount = this.amount - amount;
		System.out.println("Amount Withdrawn... current amount is : " + this.amount);
	}
	
	synchronized void deposit(int amount) {
		System.out.println("Goint to deposit...");
		this.amount = this.amount + amount;
		System.out.println("Amount deposited successfully...");
		System.out.println("Current Amount is : " + this.amount);
		notify();
	}
}

public class InterThreadCommDemo {

	public static void main(String[] args) {
		final Banker bank = new Banker();
		Thread t1 = new Thread() {
			public void run() {
				bank.withdraw(2000);
			}
		};
		t1.start();
		Thread t2 = new Thread() {
			public void run() {
				bank.deposit(1500);
			}
		};
		t2.start();
	}

}
