package a_class1_basic_programs;

public class A9 {
	public static void main(String[] args) {
		String s="hi hi my name is is ram";
		String s1="";
		String s2[]=s.split(" ");
		for(int i=0;i<s2.length;i++) {
			if(!(s.contains(s2[i]))) {
				s1=s1+s2[i]+"";
			}
		}
		System.out.println(s1);
		
	}
}
