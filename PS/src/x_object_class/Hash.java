package x_object_class;

public class Hash {
	int a=10;
	public static void main(String[] args) {
		Hash h1=new Hash();
		Hash h2=new Hash();
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		Hash h3=h1;
		System.out.println(h1.equals(h2));
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		
		
	}
	public boolean equals(Object o) {
		return this.a==((Hash)o).a;
	}
	
	
	public int hashCode() {
		return this.a+99;
	}
	
	

}
