package p_method_overriding;

public class Driver3 {
	public static void main(String[] args) {
		C1 c1=new C1();
		C2 c2=new C2();
		C3 c3=new C3();
		c1=c3;
		C3 c4=(C3)c1;
		c4.a1();
	}
	

}
