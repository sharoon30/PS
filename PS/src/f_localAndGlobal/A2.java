package f_localAndGlobal;
//calling a static global variable and also reinitiallising 
public class A2 {
	static int a=10;
	public static void main(String[] args) {
		A2 a2=new A2();
		System.out.println(a2.a);
		a2.a=20;
		System.out.println(a2.a);
		A2 a3=new A2();
		System.out.println(a3.a);
	}

}
