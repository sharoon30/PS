package xa_string_class;

public class Equals_ignore {
	public static void main(String[] args) {
		String s="rozario";
		String s1="Rozario";
		System.out.println(s1.equals(s));
		System.out.println(s1.equalsIgnoreCase(s));
	}

}
