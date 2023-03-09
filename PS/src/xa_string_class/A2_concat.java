package xa_string_class;

public class A2_concat {
	public static void main(String[] args) {
		String s1=new String("hello");
		System.out.println(s1.concat("macha"));//temp changes
		System.out.println(s1);
		String s2=s1.concat("rozario");
		System.out.println(s2);
		String s3="christy";
		System.out.println(s3.concat("neha"));
		System.out.println(s3);
		String s4="hello";
		String s5="hello";
		System.out.println(s4==s5);
		System.out.println(s4.equals(s5));
	}

}
