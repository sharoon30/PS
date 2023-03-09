package xa_string_class;
//

public class Demo {
	public static void main(String[] args) {
		String s="my  tongue name is harone toot";
		System.out.println(s.lastIndexOf('e'));
		String s1[]=s.split(" ");
		String s2=" ";
		for(int i=0;i<s1.length;i++) {
			s2=s2+s1[i];
		if(s2.charAt('t')==0 && s2.charAt('t')==s2.length()-1) {
		System.out.println(s2);
				
				}
		}
		
		}
	}


