package a_class1_basic_programs;

public class Patterns_7 {
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(j=i;j<=5;j++) {
				System.out.print("* ");
			}System.out.println();
		}
	}

}
