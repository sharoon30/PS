package j_ConstructorAndNonStaticBlock;

public class A3 {
	public static void main(String[] args) {
		A3 a1=new A3();
		A3 a2=new A3();
	}
	static {
		System.out.println("sib -3");
	
	}
	A3(){
		System.out.println("1st constructor");
	}
	{
		System.out.println("nsb-1");
		
	}
	{
		System.out.println("nsb 2");
	}

}
