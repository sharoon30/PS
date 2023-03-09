package a_class1_basic_programs_B;

public class Demo2 {
	public static void main(String[] args) {
		String s1="hey hey hi hi bye bye ";
		String s2[]=s1.split(" ");
		int count=0;
		for(int i=0;i<s2.length-1;i++) {
		
			System.out.println(s2[i]+" "+count);
		}
	}

}
