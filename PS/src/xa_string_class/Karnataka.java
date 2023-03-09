package xa_string_class;
public class Karnataka {
	public static void main(String[] args) {
		String s="KARNATAKA";
		int count=0;
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]=='A') {
				count++;
			}
		}System.out.println(count);
	}

}
