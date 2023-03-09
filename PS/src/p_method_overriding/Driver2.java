package p_method_overriding;

public class Driver2 {
	public static void main(String[] args) {
		B3 b3=new B3();
		B1 b1=new B1();
		B2 b2=new B2();
		b1=b2;
		b1.a1();
		B2 b4=(B2)b1;
		b4.a1();
		b1=b3;
		B3 b5=(B3)b1;
		b5.a1();
		b1=b2;
		B2 b6=(B2)b1;
		b1.a1();
			}


}
