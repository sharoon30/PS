package xa_string_class;

public class SplitMethod {
	public static void main(String[] args) {
		String s1="i am a test engineer ";
	String	s2[]=s1.split(" ");
	System.out.println(s2[0]);
	System.out.println(s2[1]);
	System.out.println(s2[2]);
	System.out.println(s2[3]);
	System.out.println(s2[4]);
	
	//or
	
	for(int i=0;i<s2.length;i++) {
		System.out.println(s2[i]);
		
	}
	String s3="i workin testyantra";
	String s4[]=s3.split("r");
	for(int i=0;i<s4.length;i++) {
		System.out.println(s4[i]);
	}
	}
	
	
	

}
