package Assignement;

public class PatternDouble {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			if(i%2==0) {
			   for(int j=4;j>=i;j--) {
					System.out.print("@ ");
				}
			}
			else {
				for(int j=2;j>=i;j--) {
					System.out.print("* ");
				}
			}
			if(i%2==0) {
				   for(int j=2;j>i;j--) {
						System.out.print("@ ");
					}
				}
				else {
					for(int j=4;j>=i;j--) {
						System.out.print("* ");
					}
				}
			System.out.println();
		}
	}
}
