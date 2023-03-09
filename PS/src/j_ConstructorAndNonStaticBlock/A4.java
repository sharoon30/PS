package j_ConstructorAndNonStaticBlock;

public class A4 {
	A4(){
		System.out.println("1s constructor");
	}
	{
		System.out.println("non static block 1");
	}
	public static void A1() {
		System.out.println("method ");
	}
	static {
		A1();
		System.out.println("1st static ");
	}
	public static void main(String[] args) {
		
		A4 a1=new A4();
	    A1();
	}

}
