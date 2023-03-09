package g_contructor;

public class A1 {
	String name;
	String brand;
	int cc;
	public static void main(String[] args) {
		A1 a1=new A1("RS200","bajaj",200);
		System.out.println(a1.name);//rs200
		System.out.println(a1.brand);//bajaj
		System.out.println(a1.cc);//cc
	}
	A1(String name,String brand,int cc){
		this.name=name;
		this.brand=brand;
		this.cc=cc;
	}

}
