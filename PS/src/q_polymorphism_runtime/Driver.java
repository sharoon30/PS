package q_polymorphism_runtime;

public class Driver {
	public static void main(String[] args) {
		A1_MOR a1=new A1_MOR();
		A2 a2=new A2();
		A3 a3=new A3();
		a1=a3;
		a1.a1();//upcasting
		
		
	}

}
