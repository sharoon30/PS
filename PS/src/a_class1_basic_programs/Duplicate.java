package a_class1_basic_programs;

public class Duplicate {
	public static void main(String[] args) {
		String s=" hi the the hi hi bye bye  ";
		String s1[]=s.split(" ");
		int k=0;
		String s2[] = new String[s1.length];
		for(int i=0;i<s1.length-1;i++) {	
		if((s1[i].equals(s1[i+1]))) {
			s2[k]=s1[i];
			k++;
		}
		}
		for(int i=0;i<k;i++) {
			System.out.println(s2[i]);
		}	
	}
}
