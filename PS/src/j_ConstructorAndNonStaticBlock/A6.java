package j_ConstructorAndNonStaticBlock;

public class A6 {
	public static void main(String[] args) {
		A6 a1=new A6();
	}
	A6(){
		System.out.println("1st c");
	}
	A6(int a){
		System.out.println("2nd c");
	}
	public void A1() {
		System.out.println("1st method");
	}
	{
		A1();
		System.out.println("iib-1");
	}
	static {
		System.out.println("sib-1");
	}

}
