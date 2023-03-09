package multiThreading;

public class MyThread {
	public static void main(String[] args) {
		ClassExtendingMethod c1=new ClassExtendingMethod();
		ThreadSchedulerMethod t1=new ThreadSchedulerMethod();
		t1.start();
		c1.start();
		for(int i=1;i<=10;i++) {
			System.out.println("parent thread");
		}
		
		
		
	}

}
