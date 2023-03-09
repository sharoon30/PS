package practiceBlock;
public class A1 {
	public static void main(String[] args) {
		String s1=" my name is 'sharoon' rozario";
		String sep[]=s1.split("'");
		String rev="";
		for(int i=0;i<sep.length;i++) {	
			if(i==1) {
				for(int j=0;j<1;j++) {
					char c[]=sep[i].toCharArray();
					for(int k=0;k<c.length;k++) {
						rev=c[k]+rev;
					}
				}
			}else {
				System.out.print(rev+sep[i]);	
			}
			
		}
	}
}