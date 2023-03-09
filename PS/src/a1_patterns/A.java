package a1_patterns;
public class A {
	public static void main(String[] args) {
		int rowCount=5;
		int colCount=rowCount;
		int mid = (rowCount/2)+1;
		for(int i=1;i<=rowCount;i++) {
			for(int j=1;j<=colCount;j++) {
				if(i==1 || j==1 || j==rowCount) {
					System.out.print('*'+" ");
				}
				else if(i==mid) {
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