package i_Blocks;

public class A3 {
	 int a=10;// static global variable
	
	public static void main(String[] sharun) {
		A3 n=new A3();
		System.out.println("main method");
		System.out.println("calling a non static global variable "  +n.a);
	}
	
	{//non static block
		int a=4;
		this.a=20;
		int b=5;
		int c=this.a+b;
		System.out.println("the sum is :"+c);
	}

}
