package a1_patterns;

public class C {
	public static void main(String[] args) {
		int rowCount=5;
		int colCount=rowCount;
		for(int i=1;i<=rowCount;i++) {
			for(int j=1;j<=colCount;j++) {
				if(i==1||i==rowCount||j==1)
					if((i==1||i==rowCount) && j==1)
						System.out.print(' '+" ");
					else
						System.out.print("*"+' ');
			}
			System.out.println();
		}
	}

}
