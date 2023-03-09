package k_inheritance;
//calling a non static  global variable  non static method from A5 to A6
public class A6 {
	public static void main(String[] args) {
		A5 a1=new A5();
		a1.a=10;
		a1.b=30;
		a1.A1(10);
		System.out.println(a1.b);
		System.out.println(a1.a);
		A5 a2=new A5();
		System.out.println(a2.a);
		System.out.println(a2.b);
		a2.A1(20);
	}

}
