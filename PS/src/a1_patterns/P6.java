package a1_patterns;

import java.util.Scanner;

public class P6 {
	 public static void print_pattern(int n)
	    {
	        int i=1;
	        while(i<=n){
	            String s="";
	            for(int j=1;j<=((-1)*i)+6;j++){
	                s=s+"*";
	            }
	            System.out.println(s);
	            i++;
	        }
	        while(i<=n){
	            String s="";
	            for(int j=1;j<=i;j++){
	                s=s+"*";
	            }
	            System.out.println(s);
	            i++;
	        }
	    }
	     public static void main(String[]args)
	    {
	    	 P6 p1=new P6();
	        Scanner sc=new Scanner(System.in);
	        int n = sc.nextInt();
	        print_pattern(n);
	    }

}
