package a1_interviewPrograms;

public class Demo2 {
	public static void main(String[] args) {
		String s1="hi 'my' name is 'rohan' r";
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i++) {
			if(s2[i].startsWith("'") && s2[i].endsWith("'")) {
				char c[]=s2[i].toCharArray();
				String s3="";
				for(int j=1;j<c.length-1;j++) {
					s3=c[j]+s3;
				}
				s2[i]=s3;
				System.out.println(s2[i]);
			}
		}
		for(int i=0;i<s2.length;i++) {
			System.out.print(s2[i]+" ");
		}
	}

}
