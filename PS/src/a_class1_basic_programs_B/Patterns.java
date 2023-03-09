package a_class1_basic_programs_B;

public class Patterns {
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=7;i++) {
			if(i==1&&i==4&&i==7) {
				for(j=1;j<=i;j++) {
					System.out.print("* ");
				}
			}System.out.println();
			 if(i==2&&i==3) {
				for(j=1;j<4;j++) {
					System.out.print("  ");
				}
				for(j=1;j<=i;j++) {
					System.out.print("* ");
				}System.out.println();
			}
			else if(i==5&&i==6) {
				for(j=1;j<2;j++) {
					
				}
				
			}
				
			
			
		}
	}

}
