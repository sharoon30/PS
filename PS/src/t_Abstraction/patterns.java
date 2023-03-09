package t_Abstraction;

public class patterns {
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=7;i++) {
			if(i==1||i==4||i==7)
			for(j=1;j<=4;j++) {
				System.out.print("* ");
			}
			System.out.println();
			if(i==5||i==6) {
				for(j=i;j<=4;j++) {
					System.out.print("* ");
					break;
				}System.out.println();
				
			}
			
		}
		
	}
}
