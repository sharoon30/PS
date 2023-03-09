package a1_patterns;

public class RightAddaTriangle {
	public static void main(String[] args) {
		int rowCount = 10;
		int colCount = 5;
		int mid =rowCount/2;
		int fH=mid+1;
		//int sH=mid;
		for(int i=1;i<=rowCount;i++) {
			for(int j=1;j<=colCount;j++) {
				if(j>colCount-i) {
					System.out.print('*'+" ");
				}
				else if(i>mid && j<=rowCount-i) {
					
				}
				else {
					System.out.print(' '+" ");
				}
				
			}
			System.out.println();
		}
	}

}
