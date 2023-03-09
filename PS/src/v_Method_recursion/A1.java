package v_Method_recursion;
//method recursion for static method 
public class A1 {
	static void ad() {
		ad(10);
		System.out.println("addition ");
	}
	static void ad(int a) {
		ad(10,20);
		System.out.println("substraction ");
	}
	static void ad(int a,int b) {
		ad(10,20,30);
		System.out.println("multiplication");
	}
	static void ad(int a,int b, int c) {
		System.out.println("division");
	}
	public static void main(String[] args) {
		ad();
	}

}
