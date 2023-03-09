package k_inheritance;

public class A16_patterns {
	public static void main(String[] args) {
		int i,j;
		int k=65;
		for(i=0;i<=5;i++) {
			for(j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(j=i;j<=5;j++) {
				System.out.print((char)(k+j));
			}
			System.out.println();
		}
	}

}
