package za_Array_of_object;
public class Employee {
	String ename;
	int id;
	static  int count=0;
	Employee(String ename,int id){
		this.ename=ename;	
		this.id=id;
		count++;
	}
	public String toString() {
		return "Employee name:"+this.ename+"Employee ID:"+this.id;
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee("ramesh",001);
		Employee e2=new Employee("suresh",002);
		Employee e3=new Employee("ganesh",003);
		Employee e4=new Employee("mahesh",004);
		Employee em[]=new Employee[count];
		em[0]=e1;
		em[1]=e2;
		em[2]=e3;
		em[3]=e4;
		for(int i=0;i<em.length;i++) {
			System.out.println(em[i]);
		}
	}
}