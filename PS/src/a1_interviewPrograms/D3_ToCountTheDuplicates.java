package a1_interviewPrograms;

public class D3_ToCountTheDuplicates {
	public static void main(String[] args) {
		String s=" the the the ";
		s=s.replace(" ", "");
		int dupcount=0;
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					dupcount++;
					break;
				}
			}
		}
		System.out.println(dupcount);
	}

}
