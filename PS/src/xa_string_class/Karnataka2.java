package xa_string_class;

public class Karnataka2 {
public static void main(String[] args) {
	String s="KARNATAKA";
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='A') {
			count++;
		}
	}System.out.println(count);
}
}
