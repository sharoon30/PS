package a1_interviewPrograms;

public class Demo {
	public static void main(String[] args) {
		String s1="SELENIUM2022JUNE15TIMEIS1105";
		String sum="";
		int sum1=0;
    	
    	String s2[]=new String[20];
    	int k=0;
    	
		char c[]=s1.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(Character.isDigit(c[i])) {
				sum=sum+c[i];
				
			}
			else {
				if(sum!="") {
					s2[k]=sum;
					k++;
				}
				sum="";
				
			}
			
}
		s2[k]=sum;
		for(int i=0;i<=k;i++) {
			int i1=Integer.parseInt(s2[i]);
			sum1+=i1;
		}
		System.out.println(sum1);
		
	}
}