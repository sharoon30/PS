package t_Abstraction;

public class B_driver {
	public static void main(String[] args) {
	      B2 b2=new B2();
	      B1 b1=b2;
	      B2 b3=(B2)b1;
	      b3.sub();
	      
	}

}
