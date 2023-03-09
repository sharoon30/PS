package a1_patterns;

public class Pro {
	public static void main(String[] args) {
		int rowCount = 5;
		int colCount = 5;
		int space = colCount-1;
		int dataCount = 1;
		
		for(int i=1;i<=rowCount;i++) {
			for(int j=1;j<=colCount;j++) {
				for(int k=1; k<space; k++) {
					System.out.print("  ");
				}
				for(int l=1; l<dataCount; l++) {
					System.out.print("* ");
				} 
				System.out.println();
				space--;
				dataCount++;
			}
		}
		
	}

}
