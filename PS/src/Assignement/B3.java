package Assignement;

public class B3 {
	public static void main(String[] args) {
		int i,j;
		for( i=0;i<5;i++) {
			for(j=0;j<=i;j++) {
				System.out.print(" ");
			}
			if(i==1 || i==3) {
				for(int k=i;k<5;k++) {
					System.out.print("*");
				}
			}else {
			for(int k=5;k>i;k--) {
			   System.out.print("@");
			}	
		}
			if(i==1 || i==3) {
				for(int k=i;k<5;k++) {
					System.out.print("*");
				}
			}else {
			for(int k=5;k>i;k--) {
			   System.out.print("@");
			}	
		}
			System.out.println();
	}
}}

