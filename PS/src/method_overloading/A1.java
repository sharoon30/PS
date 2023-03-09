package method_overloading;
//create a method with same name and pass different args
public class A1 {
	public static void main(String[] args) {
		a(10,15);
		a(10.2,10.6);
		a(10,20,20);
	}
	static void a(int a,int b) {
		int c=a+b;
		System.out.println(c)
		;
	}
	static void a(double a,double b) {
		double c= a+b;
		System.out.println(c);
	}
	static void a(int a , int b,int c) {
		int d=a+b+c;
		System.out.println(d);
	}

}
