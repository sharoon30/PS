package xa_string_class;

public class Contains_method {
	public static void main(String[] args) {
		String s="lion tiger elephant cati";
		String s1[]=s.split(" ");
		String s2;
		for(int i=0;i<s1.length;i++) {
			s2=s1[i];
			boolean k=s2.contains("i");
			if(k==true) {
				System.out.println(s2);
			}
		}
	}

}
