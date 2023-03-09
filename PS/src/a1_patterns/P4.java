package a1_patterns;

public class P4 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			String s="";
			for(int j=1;j<=((-1)*i)+6;j++) {
				s=s+"*";
			}
			System.out.println(s);
		}
		for(int i=1;i<=5;i++) {
			String s="";
			for(int j=1;j<=i;j++) {
				s=s+"*";
			}
			System.out.println(s);
		}
	}
}
