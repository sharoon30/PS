package a1_patterns;

public class B {
	public static void main(String[] args) {
		int rowCount = 5;
		int colCount = rowCount;
		int mid = (rowCount/2)+1;
		for(int i=1;i<=rowCount;i++) {
			for(int j=1;j<=colCount;j++) {
				if(i==1 || i==rowCount || j==1 || j==colCount || i==mid) {
					if(i==mid && j==colCount)
						continue;
					else
					System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}
