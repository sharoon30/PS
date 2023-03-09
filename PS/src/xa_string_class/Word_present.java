package xa_string_class;

public class Word_present {
	public static void main(String[] args) {
		String s="mo mobile loper munde";
		String s1[]=s.split(" ");
		String s2;
		for(int i=0;i<s1.length;i++) {
			s2=s1[i];
			int b=s2.indexOf('o');
			if(b>=0) {
				System.out.println(s2);
			}
		}
	}

}
