package f_localAndGlobal;
//calling a non static gloabal inside a main method 

public class A1 {
	int a=10;
	int b;
	public static void main(String[] args) {
		A1 a1=new A1();
		a1.a=20;
		System.out.println(a1.a);//20
		A1 a2=new A1();
		System.out.println(a2.a);//10
		A1 a3=new A1();
		a3.a=40;
		System.out.println(a3.a);
		System.out.println(a3.b);//default value ie 0;
	}

}
