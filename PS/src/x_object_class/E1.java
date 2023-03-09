package x_object_class;

public class E1 {
	int a;
	E1(int a){
		this.a=a;
	}
	public String toString() {
		return "a:"+this.a;
	}
	public boolean Equals(Object obj) {
		return this.a==((E1)obj).a;
	}
	public int hashCode() {
		return this.a+10;
	}
	public static void main(String[] args) {
		E1 e=new E1(10);
		System.out.println(e);
		E1 e2=new E1(10);
		System.out.println(e.Equals(e2));
		System.out.println(e.hashCode());
		System.out.println(e2.hashCode());
	}
}
