package j_ConstructorAndNonStaticBlock;

public class A2 {
	public static void main(String[] args) {
		System.out.println("main");
		A2 a1=new A2();
	}
	{
		System.out.println("1st non sttic block");//this one will gets exc
	}
	{
		System.out.println("2nd nonstatic block");
	}
	static {
		System.out.println("static block");//1st executes 
	}
	A2(){
		System.out.println("1st constructor");
	}

}
