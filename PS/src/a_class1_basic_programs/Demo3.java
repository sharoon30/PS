package a_class1_basic_programs;
import java.util.Scanner;
public class Demo3 { 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j;
		boolean key;
		 
		     key=true;
		     for(j=2;j<i;j++) {
		    	 if(i%j==0) {
		    		 key=false;
		    	 }
		     }
		     if(key==true) {
		    	 System.out.println(i+" prime");
		     }
		     else {
		    	 System.out.println(i+" not a p");
		     }
		
	}		
	   
	}



