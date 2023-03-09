package zb_Wrapperclass;

public class Unboxing {
	public static void main(String[] args) {
		Integer b=10;//auto Boxing//converted into an object
		System.out.println(b.toString());
		int c=(int)b;
		System.out.println(c);
//	int c	=b.intValue();//here with the help of intValue() method the object is converted into value and it is stored
	System.out.println(c);
		
	}

}
