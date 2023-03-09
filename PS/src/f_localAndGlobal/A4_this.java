package f_localAndGlobal;

public class A4_this {
	int a=10;
	public static void main(String[] args) {
		A4_this a1=new A4_this();
		a1.demo();
	}
	public void demo()
	{
		System.out.println(this.a);
		
	}

}
