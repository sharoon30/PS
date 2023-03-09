package xa_string_class;
//"return type of starts with and ends with method is boolean"
public class Wl {
public static void main(String[] args) {
	String s1="my name is ram";
	boolean b=s1.startsWith("");//true
	System.out.println(b);
	b=s1.startsWith("ym");
	System.out.println(b);//false
	boolean ends=s1.endsWith("am");
	System.out.println(ends);//true
	ends=s1.endsWith("is");
	System.out.println(ends);//false
//	System.out.println(b2);
	}
}