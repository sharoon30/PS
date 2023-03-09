package xa_string_class;

public class A1 {
	public static void main(String[] args) {
		String s=new String("hello");
		String s1=new String("hey");
		String s2=new String("hello");
		s1="rozay";
		System.out.println(s1);
		System.out.println(s==s2);
	}

}
