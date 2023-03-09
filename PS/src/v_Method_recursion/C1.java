package v_Method_recursion;

public class C1 {
	String name;
	void c() {
		c1();
	}
	int c1() {
		c2();
		int b=10;
		System.out.println ("integer");
		return b;
	}
	float c2() {
		c3();
		float b=10.2f;
		System.out.println("floating");
		return b;
	}
	String c3() {
		System.out.println("string");
	return name+"clip"	;
	}
	public static void main(String[] args) {
		C1 c1=new C1();
		c1.c();
	}
	

}
