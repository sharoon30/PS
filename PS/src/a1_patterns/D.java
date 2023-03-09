package a1_patterns;

public class D {
	public static void main(String[] args) {
		int rowCount=5;
		int colCount=5;
		for(int i=1;i<=rowCount;i++) {
			for(int j=1;j<=colCount;j++) {
				if(i==1||j==1||i==rowCount||j==colCount)
					if((i==1||i==rowCount) && j==colCount)
						System.out.print(' '+" ");
					else
						System.out.print('*'+" ");
				else
					System.out.print(' '+" ");
			}
			System.out.println();
		}
	}

}
