package a_class1_basic_programs_B;

public class Snake {
	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=5;i++) {
			if(i%2 == 0) {
				
				for(int j=1;j<=5;j++) {
					System.out.print(k++ +" ");
				}
				k=k+5;
				System.out.println();
			}
			else {
				for(int j=1;j<=5;j++) {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		
	}

}
