package k_inheritance;

public class A4 {
	public static void main(String[] args) {
		A3 a1=new A3();
		a1.a=60;
		a1.b=100;
		System.out.println(a1.a);
		System.out.println(a1.b);
		A3 a2=new A3();
		a2.b=5;
		System.out.println(a2.a);
		System.out.println(a2.b);
	}

}
