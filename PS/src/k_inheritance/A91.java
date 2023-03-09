package k_inheritance;
//calling static members from A9 to A91
public class A91 {
	static int a=10;
	public static void main(String[] args) {
		System.out.println(A9.a);
		A9 a1=new A9();
		System.out.println(a1.a);
		System.out.println(a);
	    A9.A1(5);
	}

}
