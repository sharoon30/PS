package w_Encapsulation;
//boss
public class B1 {
	private String name;
	private int age;
	private double salary;
	B1(String name,int age,double salary ){
		this.name=name;
		this.age=age;
		this.salary=salary;		
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
		
	}
	public double getSalary() {
		return this.salary;
	}
	public void setSalary(double salary) {
		if(salary>this.salary) {
			this.salary=salary;
			System.out.println("modified salary"+this.salary);
		}
	}
	

}
