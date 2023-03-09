package Zc_comparableJ;
import java.util.ArrayList;
import java.util.Collections;
	//Cparable is an interface having a non static abstract method ;
	// contains  int compareTo(Object obj)
	//collections.sort()  uses compareTo method Internally to sort the element
	public class Emp implements Comparable {
		String name;
		int eid;
		double salary;
		Emp(String name , int eid , double salary){
			this.name=name;
			this.eid=eid;
			this.salary=salary; 
		}
		@Override
		public int compareTo(Object e) {
			if(this.salary>((Emp)e).salary) {
				return -1;
			}
			else if(this.salary<((Emp)e).salary) {
				return 1;
			}
			else {
			return 0;
			}
			
		}		
		public String toString() {
			return "salary:"+this.salary;
		}
		public static void main(String[] args) {
			ArrayList a1=new ArrayList();
			Emp e1=new Emp("raki",01,200);
			Emp e2=new Emp("sure",29,300);
			Emp e3=new Emp("Hem",4,3002);
			Emp e4=new Emp("lal",3,3100);
			Emp e5=new Emp("Mam",5,1300);
			a1.add(e1);
			a1.add(e2);
			a1.add(e3);
			a1.add(e4);
			a1.add(e5);
			for(Object o:a1) {
				Emp e8=(Emp)o;
				System.out.println(e8);
			}
			Collections.sort(a1);		
		}
}