package i_Blocks;
// non static block
public class A2 {
	public static void main(String[] args) {
		A2 a2=new A2();
		
		System.out.println("main method ");
		A2 a1=new A2();
		
	}
	{
		System.out.println("non stattic block");
	}
	{
		System.out.println("instance initiator bloack 2");
	}
	{
		System.out.println("iib3");
	}
	

}
