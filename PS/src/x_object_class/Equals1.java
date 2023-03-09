package x_object_class;

public class Equals1 {
	int eid;
	Equals1(int eid){
		this.eid=eid;
	}
	public boolean equals(Object obj) {
		return this.eid==((Equals1)obj).eid;
	}
	
	public static void main(String[] args) {
		Equals1 e1=new Equals1(12);
		System.out.println(e1.toString());
		add(20);
		Equals1 e2=new Equals1(12);
		System.out.println(e1.equals(e2));  
	}
 static	void add(int a) {
	 a+=20;
	System.out.println(a);
}
}