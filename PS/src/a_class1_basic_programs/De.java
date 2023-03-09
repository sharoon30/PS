package a_class1_basic_programs;

public class De {
	public static void main(String[] args) {
		String s1="Sharoon rozarion";
		char c[]=s1.toCharArray();
		String s2="";
		String s3[];
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					j++;
					break;
				}
				else if(c[i]!=c[j]) {
		
				}
			}
		}
		System.out.println(s2);
	}

}
