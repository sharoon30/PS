package j_ConstructorAndNonStaticBlock;

public class A5 {
	public static void main(String[] args) {
		A5 a1=new A5(10);
		A5 a2=new A5();
		
	}
	A5(){
		System.out.println("1st constructor");
	}
	A5(int a){
		System.out.println(" 2nd constructor");
	}
	{
		System.out.println("sib-1");
	}
	public static void A1() {
		System.out.println("method ");
	}
	static {
		A1();
		System.out.println("iib-1");
	}
	

}
