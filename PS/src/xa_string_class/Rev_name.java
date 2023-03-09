package xa_string_class;

public class Rev_name {
	public static void main(String[] args) {
		String s="sharoon ";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}System.out.println();
		System.out.println(s.charAt(2));
	}

}
