package a_class1_basic_programs_B;
public class S123 {
	public static void main(String[] args) {
		String s1="india";
		int k=0;
		for(int i=0;i<(s1.length()+s1.length()-1);i++) {
			if(i<s1.length()) {
				for(int j=0;j<=i;j++) {
					System.out.print(s1.charAt(j));
				}
				System.out.println();
			}
			else {
				for(int j=0;j<s1.length();j++) {
					if(k>=j) {
						System.out.print(' ');
					}
					else {
						System.out.print(s1.charAt(j));
					}
				}
				k++;
				System.out.println();
			}
		}
	}
}