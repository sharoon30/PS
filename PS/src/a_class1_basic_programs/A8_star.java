package a_class1_basic_programs;

public class A8_star {
	public static void main(String[] args) {
		String s=" hi hi my name is is ram";
		String s1[]=s.split(" ");
		String r="";
		for(int i=0;i<s1.length;i++) {
			for(int j=i+1;j<s1.length;j++) {
				if(s1[i].equals(s1[j])) {
					s1[j]="ohh";
				}
			}
		}
		for(String x:s1) {
			if(x!="ohh") {
				r=r+x+"";
			}
		}
		System.out.println(r);
		
	}

}
