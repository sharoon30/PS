package xa_string_class;

public class B1 {
	public static void main(String[] args) {
		String s1="my name is sharoon";
		char c[]=s1.toCharArray();
		String sent="";
		for(int i=0;i<c.length;i++) {
			
			if(c[i]=='m'||c[i]=='n') {
				String var = ""+c[i];
				sent=sent+var.toUpperCase();
//				System.out.print(sent.toUpperCase());
			}
			else {	
//			System.out.print(c[i]);
				sent=sent+c[i];
			}
		}
		System.out.println(sent);
	}
}
