package s_Variable_shadowing;

public class Driver {
	
	public static void main(String[] args) {
		A1 a1=new A1();
		A2 a2=new A2();
		a1=a2;
		System.out.println(a1.b);
		
	}

}
