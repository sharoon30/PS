package a_class1_basic_programs_B;

public class N1 {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			String s="";
			for(int j=1;j<=(-1)*i+3;j++) {
				s=s+" ";
			}
			for(int j=1;j<=2*i+(-1);j++) {
				s=s+"*";
			}
		
			
			System.out.println(s);
		}
		for(int i=1;i<=5;i++) {
			String s="";
			for(int j=1;j<=i;j++) {
				s=s+" ";
			}
			for(int j=1;j<=2*(-i)+5;j++) {
				s=s+"*";
			}System.out.println(s);
		}
		
	}

}
