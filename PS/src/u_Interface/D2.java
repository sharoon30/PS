package u_Interface;

public class D2 implements D1,D3{
	public void  add(){
		System.out.println("addition ");
	}
	public  void  sub() {
		System.out.println("substraction");
	}
	public void  mul() {
		System.out.println("multiplication");
	}
	
public static void main(String[] args) {
	System.out.println(D1.a);
	D1.min();
	D3.max();
	System.out.println(D3.b);
}
}
