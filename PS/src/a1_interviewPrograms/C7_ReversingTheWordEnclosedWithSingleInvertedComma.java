package a1_interviewPrograms;

public class C7_ReversingTheWordEnclosedWithSingleInvertedComma {
	public static void main(String[] args) {
		String s1="hi my 'name' is 'sharoon' ";
		String s2[]=s1.split("'");
		String word1="";
		String word2="";
		String fullname="";
		for(int i=0;i<s2.length;i++) {
			if(i==1) {
				char c[]=s2[i].toCharArray();
				for(int j=0;j<c.length;j++) {
					word1=c[j]+word1;
				}	
				fullname=fullname+word1;
			}
			else if(i==3) {
				char c1[]=s2[i].toCharArray();
				for(int k=0;k<c1.length;k++) {
					word2=c1[k]+word2;	
				}
				fullname=fullname+word2;
			}
			else {
				fullname=fullname+s2[i];
			}
	}
		System.out.println(fullname);
}
}