package c_method;

public class A1 {
	
//method to add 2 variable
	int h=10;
	public static void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
public  void mul(int j) {
	
		int i=this.h*j;
		System.out.println("product is :"+i);
	}
	public static void main(String[] args) {
		add(10,20);
		A1 a1=new A1();
		a1.sub(10,5);
		a1.mul(2);
		
	}
	public void sub(int d,int e) {
	      int f=d-e;
	      System.out.println("the difference of d and e is :"+f);
	}
	
	
	
	
}
