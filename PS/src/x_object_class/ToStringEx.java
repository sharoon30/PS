package x_object_class;

public class ToStringEx {
	int a=10;
	public static void main(String[] args) {
		ToStringEx t1=new ToStringEx();
		System.out.println(t1);
		
	}
	public String toString() {
		return "Global variable "+this.a;
	}

}
