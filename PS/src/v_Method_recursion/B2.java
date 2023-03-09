package v_Method_recursion;

public class B2 {
	public static void main(String[] args) {
		B2 b2=new B2();
		b2.b2(12);
	}
	void b2(int a) {
		b2();
		System.out.println("sharon");
	}
	void b2() {b2(12,12);
		System.out.println("rozarion");
	}
	void b2(double q) {
		
		System.out.println(q);
	}
	void b2(int a,int b) {
		b2(10.2);
		System.out.println("fish");
	}

}
