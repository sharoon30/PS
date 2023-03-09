package l_inheritance_concept;

public class B2 extends B1{
	int b=20;
	void add() {
		System.out.println("rozario");
	}
	public static void main(String[] args) {
		B1 b1=new B1();
		B2 b2=new B2();
		/*
		 * System.out.println(b2.a); System.out.println(b2.b);
		 */
		b1.add();
		b2.add();
		b1=b2;
		System.out.println("===/*/*/*/*/======");
	    b1.add();
	    b2.add();
	    System.out.println("===/*/*/*/*/======");
	    System.out.println(b1.a);
	    B2 b3=(B2)b1;
	    System.out.println(b3.a);
	    System.out.println(b3.b);
	
	
	}
}
