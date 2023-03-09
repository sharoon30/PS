package x_object_class;

public class EqualsM {
	int a=10;
	public static void main(String[] args) {
		EqualsM e1=new EqualsM();
		EqualsM e2=new EqualsM();
		System.out.println(e1.equals(e2));
	}
	public boolean equals(Object obj) {
		return this.a==((EqualsM)obj).a;
	}

}
