package xa_string_class;

public class Demo2 {
	public static void main(String[] args) {
		String s="the theme hole bird toot";
		String s1[]=s.split(" ");
		String s2;
		for(int i=0;i<s1.length;i++) {
			s2=s1[i];
			/* int m=s2.lastIndexOf('t');
			boolean n=s2.startsWith("t");*/
			if(s2.endsWith("t")==true && s2.startsWith("t")==true ) {
				System.out.println(s2);
			}
			
		}
		
	}

}
