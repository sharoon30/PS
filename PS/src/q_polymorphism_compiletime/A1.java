package q_polymorphism_compiletime;
//method overloading
public class A1 {
	void a1() {
		System.out.println("rozario");
	}
	void a1(int a) {
		System.out.println("sharun");
	}
	int a1(int b,int c) {
		int i=10;
		System.out.println("christy");
		return b;
	}
	public static void main(String[] args) {
		A1 a1=new A1();
		a1.a1(50,50);
		a1.a1(10);
		System.out.println(a1.a1(10, 20));
	}

}
