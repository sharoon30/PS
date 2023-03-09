package q_polymorphism_runtime;

public class Dr1 {
	public static void main(String[] args) {
		B1 b1=new B1();
		B2 b2=new B2();
		b1.trip();
		V1 v1=new V1();
		B3 b3=new B3();
		b1=b3;
		B3 b4=(B3)b1;
		v1.via(b4);
		
	}

}
