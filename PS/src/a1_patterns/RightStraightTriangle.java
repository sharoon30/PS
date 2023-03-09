package a1_patterns;

public class RightStraightTriangle {
	public static void main(String[] args) {
		int rowCount = 5;
		int colCount = rowCount;
		int extra = rowCount+1;
		for(int i=1;i<=rowCount;i++) {
			for(int j=1;j<=colCount;j++) {
				if(j>=extra-i) {
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
