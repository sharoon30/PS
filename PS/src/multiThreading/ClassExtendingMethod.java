package multiThreading;

public class ClassExtendingMethod extends Thread {
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Thread 1");
		}
		add();
		sub();
		
	}
	public static void add() {
		System.out.println("addition");
	}
	public static void sub()
	{
		System.out.println("sub");
	}

}
