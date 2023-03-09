package a_class1_basic_programs;

public class Patterns_10 {
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=3;i++) {
			if(i==2) {
				for(j=1;j<=i;j++) {
					System.out.print("*");
				}System.out.println();
			}
			if(i==1||i==3) {
				for(j=1;j<=4;j++) {
					System.out.print("*");
				}System.out.println();
			}

		}
	}

}
