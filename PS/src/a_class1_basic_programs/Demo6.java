package a_class1_basic_programs;

public class Demo6 {
	public static void main(String[] args) {
		String s="who are you hello";
		String s1[]=s.split(" ");
		String s2=" ";
		int j;
		for(int i=0;i<s1.length;i++) {
		   s2=s1[i];
		   j=s2.indexOf('w');
		   if(j>=0) {
			   System.out.println(s2);
		   }
			
			
			
			
			
			
		}
	}

}
