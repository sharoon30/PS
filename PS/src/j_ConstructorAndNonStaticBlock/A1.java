package j_ConstructorAndNonStaticBlock;
//in case of constructor and non static block
public class A1 {
	public static void main(String[] args) {
		A1 a1=new A1();
	}
	A1(){
		System.out.println("1st c");
	}
	{
		System.out.println("2nsb");
	}
	

}//
