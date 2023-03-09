package x_object_class;

public class A1_ToStringMethod {
static	int a;
	A1_ToStringMethod(int a){
		this.a=a;
	}
	public String toString() {
		return "a:"+A1_ToStringMethod.a;
	}

	public static void main(String[] args) {
		A1_ToStringMethod a=new A1_ToStringMethod(10);
		System.out.println(a);//
	}
}
