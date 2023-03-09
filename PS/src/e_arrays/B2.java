package e_arrays;

public class B2 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {2,3,4,5};
		int c[]= {234,3,56};
		int d[][]= {a,b,c};
		for(int i=0;i<d.length;i++) {
			for(int j=0;j<d[i].length;j++) {
				System.out.print(" "+d[i][j]);
			}
			System.out.println();
		}
	}

}
