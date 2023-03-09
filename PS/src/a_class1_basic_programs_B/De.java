package a_class1_basic_programs_B;

public class De {
	public static void main(String[] args) {
		String s="Hello";
		String s2="world";
		s=s+s2;
		s2=s.substring(0, s.length()-s2.length());
		s=s.substring(s2.length());
		System.out.println(s);
		System.out.println(s2);
	}
}
