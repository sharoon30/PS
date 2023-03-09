package x_object_class;

public class HashC {
	int a=10;
	public static void main(String[] args) {
		HashC h1=new HashC();
		HashC h2=new HashC();
		System.out.println(h1.equals(h2));
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		
		}
	public boolean equals(Object o) {
		return this.a==((HashC)o).a;
	}
	public int hashCode()
	{
		return this.a+10;
	}
	
	

}
