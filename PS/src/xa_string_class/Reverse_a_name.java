package xa_string_class;

public class Reverse_a_name {
	public static void main(String[] args) {
		String s1="rozario";
		char c[]=s1.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]);
		}
	}

}
