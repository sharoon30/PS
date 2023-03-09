package a1_interviewPrograms;

public class D5_ConvertingTheSelectedCharacterIntoUppercase {
	public static void main(String[] args) {
		String s1="JAVA";
		String s2="";
		String s3="";
		//s1=s1.replace("J", "j");
		char c[]=s1.toCharArray();
	
		for(int i=c.length-1;i>=0;i--) {
			if(i==3) {
				s2=c[i]+s2;
				s2=s2.toLowerCase();
				System.out.print(s2);
			}
			else if(i==0) {
				s3=c[i]+s3;
				s3=s3.toLowerCase();
				System.out.print(s3);
			}
			else {
				System.out.print(c[i]);
			}
			
			
		}
		
	}

}


