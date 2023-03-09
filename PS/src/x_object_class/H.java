package x_object_class;

public class H {
	public static void main(String[] args) {
		H h1=new H();
		H h2=new H();
		System.out.println(h1.equals(h2));
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		H h3=h1;
		System.out.println(h1.equals(h3));
		System.out.println(h1.hashCode());
		System.out.println(h3.hashCode());
		
		
		
	}

}
