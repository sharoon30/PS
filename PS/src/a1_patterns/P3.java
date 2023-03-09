package a1_patterns;

public class P3 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			String s="";
			if(i%2!=0) {
				for(int j=1;2*j<=(-i)+11;j++) {
					s=s+"*";
				}
				System.out.println(s);
			}
		}
	}

}
