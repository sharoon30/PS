package u_Interface;

public  class C2 implements C1,B1 {
	public void a1() {
		System.out.println("method-1");
	}
	public void a2() {
		System.out.println("method");
	}
	public  void a4() {
		System.out.println("enjoy");
	}
	public static void main(String[] args) {
		C2 c2=new C2();
		c2.a1();
		C1 c1=c2;
		c1.a1();
		/*B1 b1=c2;
		b1.a4();
		B1.a1();*/
	}

}
