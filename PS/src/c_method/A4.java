package c_method;
//non static method with return type 
public class A4 {
	public static void main(String[] args) {
		A4 a4=new A4();
		int b=a4.add(5, 7);
		System.out.println(b);
		
	}
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}
	

}
