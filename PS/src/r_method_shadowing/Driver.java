package r_method_shadowing;

public class Driver {
	public static void main(String[] args) {
		A1 a1=new A1();
		A3 a3=new A3();
		a1=a3;
		a1.a1();// method shadowing
	}

}
