package g_contructor;

public class A4 {
	String name;
	String brand;
	int cc;
	public static void main(String[] args) {
		A4 a1=new A4("rs200","bajaj",200);
		System.out.println(a1.name+""+a1.brand+""+a1.cc);
		A4 a2=new A4("r15","yamaha",155);
		System.out.println(a2.name+""+a2.brand+""+a2.cc);
		
	
	}
	A4(String name,String brand,int cc){
		this.name=name;
		this.brand=brand;
		this.cc=cc;
	}
	
	
	

}
