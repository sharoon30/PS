package a1_interviewPrograms;

public class C8_ConvertingAWordInAStringIntoUpperCase {
	public static void main(String[] args) {
		String s1="My name is sharoon is";
		char c[]=s1.toCharArray();
		
		
		for(int i=0;i<c.length;i++) {
			String out="";
			if(c[i]=='i'||c[i]=='s') {
				out=out+c[i];
				System.out.print(out.toUpperCase());
			}
			else {
				System.out.print(c[i]);
			}
			
		}
	}

}
