package f_localAndGlobal;

public class A3 {
	static int a=10;
	int b=20;
	public static void main(String[] args) {
		A3 a1=new A3();
		a1.a=20;
		a1.b=30;
		System.out.println(a1.a);
		System.out.println(a1.b);
		A3 a2=new A3();
		System.out.println(a2.a);
		System.out.println(a2.b);
	}

}
