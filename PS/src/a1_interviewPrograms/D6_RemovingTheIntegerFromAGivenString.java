package a1_interviewPrograms;

public class D6_RemovingTheIntegerFromAGivenString {
	public static void main(String[] args) {
		String s1="shar1o0n";
		char c[]=s1.toCharArray();
		String result="";
		for(int i=0;i<c.length;i++) {
			if(!Character.isDigit(c[i])) {
				result=result+c[i];
			}
		}
		System.out.println(result);
	}

}
