package a_class1_basic_programs_B;

public class Patt {
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=4;i++) {
			for(j=1;j<=i;j++) {
				
				System.out.print("* ");
			}System.out.println();
		}
		for(i=3;i>=1;i--) {
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
}
