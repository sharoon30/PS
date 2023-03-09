package w_Encapsulation;

public class B_driver {
	public static void main(String[] args) {
		B1 b1=new B1("sharon",23,19400);
		B2 b2=new B2("rozario",25,50000);
		B3 b3=new B3("sharoon rozario",27,100000);
		B_driver z=new B_driver();
	
	b1.setSalary(30000);
	z.display(b1);	
		
		
	}
	void display(B1 b) {
		System.out.println(b.getName());
		System.out.println(b.getAge());
		System.out.println(b.getSalary());
	
	}

}
