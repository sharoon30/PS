package a_class1_basic_programs;
import java.util.Scanner;
public class Demo2 {
	public static void main(String[] args) {
	     int b=sOeO();
	     System.out.println(b+ "the sum of odd");
	
	    }
	public static int sOeO() {
		int j=0,k=0;
		for(int i=10;i<=20;i++) {
			if(i%2==0) {
				j=j+i;
			}
			else {
				k=k+i;
			}
		}
		System.out.println(j+" the sum of even");
		return k;
		
	}
	}

	


