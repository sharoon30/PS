package a1_patterns;

public class P2 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			String s="";
			for(int j=1;j<=((-1)*i+6);j++) {
				s=s+"*";
			}
			for(int j=1;j<=(2*i+(-2));j++) {
				s=s+" ";
			}
			for(int j=1;j<=((-1)*i+6);j++) {
				s=s+"*";
			}
			System.out.println(s);
		}
	}

}
