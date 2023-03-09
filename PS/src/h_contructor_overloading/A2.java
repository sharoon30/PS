package h_contructor_overloading;

public class A2 {
	public static void main(String[] args) {
		A2 a1=new A2(10,10.5);
		
	}
	A2(double a,double b){
		System.out.println("1st constructor");
	}
	A2(double a, int b){
		System.out.println("2nd constructor ");
	}
	A2(int a, double b){
		System.out.println("3rd constructor ");
	}

}
