package a1_patterns;

public class P8 {
	public static void main(String[] args) {
		int number = 5;
		
		for(int i=1;i<=number;i++) {
			String s="";
			for(int j=1;j<=i-1;j++) {
				s=s+" ";
			}
			if(i%2!=0) {
				for(int j=1;j<=6-i;j++) {
					s=s+"@ ";
				}
			}
			else {
				for(int j=1;j<=6-i;j++) {
					s=s+"* ";
				}
			}
			System.out.println(s);
	}
}
}