package g_contructor;
//write a program for no argument constructor 
public class A2 {
	int a=10;
	public static void main(String[] args) {
		A2 a1=new A2();
		System.out.println("the main method ");
		a1.appleS();
	}
	A2(){
		int b=a;
		System.out.println("the first contructor"+b);
	}
	public void appleS() {
		int a=this.a;
		System.out.println(a);
	}
	
}
