package l_inheritance_concept;
//A3 is the subclass of A4
public class A3 extends A4 {
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		a=2;
		System.out.println(a);
	    System.out.println(A4.a);
	    System.out.println(A3.a);
	    A3 a3=new A3();
	    System.out.println(a3.a);
	    A1();
	    A4.A1();
	    A3.A1();
	}

}
