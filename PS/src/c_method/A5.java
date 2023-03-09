package c_method;
//non static method with return type 
public class A5 {
	public static void main(String[] args) {
		A5 a5=new A5();
		int e=a5.mul(10.5,20.4,5.5);
		
		
		System.out.println(e);
		
	}
	public int  mul(double a,double b,double m ) {
		double  c=a*b*m;
		int d=(int )c;
		return d;
	}

}
