package f_localAndGlobal;
//
public class A5 {
	int a=10;
	public static void A1() {
		A5 a2= new A5();// not a good habit 
		System.out.println(a2.a);
	}
	public static void main(String[] args) {
		A5 a1=new A5();
		A1();
	}

}
