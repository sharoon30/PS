package xa_string_class;

public class S1 {
	public static void main(String[] args) {
		String s="Madam";
		s=s.replace("M", "m");
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	
}
}