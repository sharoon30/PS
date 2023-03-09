package a1_patterns;

public class E {
	public static void main(String[] args) {
		int rowCount=7;
		int colCount=5;
		int mid = (rowCount/2)+1;
		for(int i=1;i<=rowCount;i++) {
			for(int j=1;j<=colCount;j++) {
				if(i==1||i==rowCount||j==1||i==mid)
					System.out.print('*'+" ");
				else
					System.out.print(' '+" ");
			}
			System.out.println();
		}
	}
}
