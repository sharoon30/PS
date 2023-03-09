package x_object_class;

public class Equals {
	int a=10;
	public static void main(String[] args) {
		Equals e1=new Equals();
		Equals e2=new Equals();
		System.out.println(e1.equals(e2));
		
	}
	public boolean equals(Object obj) {
		return this.a==((Equals)obj).a;
	}


}
