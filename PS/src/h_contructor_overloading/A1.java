package h_contructor_overloading;
// create 2 constructor 
public class A1 {
	public static void main(String[] args) {
		A1 a1=new A1(20.6,5);
	}
	A1(int a,double b){
		System.out.println("1st constructor");
	}
	A1(double a,int b){
		System.out.println("2nd constructor");
	}

}
