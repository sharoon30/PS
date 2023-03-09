package j_ConstructorAndNonStaticBlock;

public class Demo {
	static int a=10;
	public static void main(String[] args) {
		int c=add(20);
		System.out.println(c);
		Demo a1=new Demo();
		int b=a1.sub(5);
		System.out.println(b);
	}
	public static int add(int a)
	{
		int c=Demo.a+a;
		return c;
	}
	public int sub(int a) {
		int b=this.a-a;
		return b;
	}
	static {
	  int a=10;
	  int b= a+Demo.a;
	  System.out.println("the sum is"+b);
	}

	

}
