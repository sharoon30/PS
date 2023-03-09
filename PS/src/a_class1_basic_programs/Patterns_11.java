package a_class1_basic_programs;

public class Patterns_11 {
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++) {
			if(i%2!=0) {
				for(j=1;j<=5;j++) {
					System.out.print("*");
				}System.out.println();
			}
			if(i==2) {
				for(j=1;j<i;j++) {
					System.out.print("*");
				}System.out.println();

			}
			if(i==4) {
				for(j=1;j<5;j++) {
					System.out.print(" ");
				}
				if(j==5) {
					System.out.println("*");
				}

			}System.out.println();
		}	

	}		
}


