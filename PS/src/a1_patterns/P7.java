package a1_patterns;

public class P7 {
	public static void main(String[] args) {
	for(int i=1;i<=10;i++) {
		String s1="";
		if(i%2!=0) {
			for(int j=1;2*j<=11-i;j++) {
				s1=s1+"*";
			}
		}
		else {
			for(int j=1;2*j<=i;j++) {
				s1=s1+"*";
			}
		}
		System.out.println(s1);
	}
	}
	
	}