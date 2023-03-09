package xa_string_class;

public class Contains {
	public static void main(String[] args) {
		String s1="";
		boolean b=s1.isEmpty();
		System.out.println(b);//false
		String s2="my name is ram";
		boolean b1=s2.contains("my");
		System.out.println(b1);//true
		System.out.println(s2.contains("man"));//false
	}
}
