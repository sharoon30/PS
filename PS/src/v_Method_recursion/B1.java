package v_Method_recursion;

public class B1 {
	void b1
	() {
		b3(10.23);
		System.out.println("sharoon");
	}
	void b2(int a) {
		System.out.println("sharoon");
	}
	void b3(double a) {
		b2(10);
		System.out.println("keyboard");
	}
	public static void main(String[] args) {
		B1 b1 =new B1();
		b1.b3(45.6);
		
	}

}
