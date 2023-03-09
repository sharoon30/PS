package a_class1_basic_programs;

public class B6 {
	public static void main(String[] args) {
		String s1=" hi my name is sharoon rozario";
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i++) {
			if(s2[i].contains("name") || s2[i].contains("rozario")  ) {
				String s3="";
				char c[]=s2[i].toCharArray();
				for(int j=0;j<c.length;j++) {
					s3=c[j]+s3;
				}
				s2[i]=s3;
				System.out.print(s2[i]+" ");
			}
			else {
				System.out.print(s2[i]+" ");
			}
		}
		
	}

}
