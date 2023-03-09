package a_class1_basic_programs;
import java.util.*;
public class Ascending {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("size please");
	int size=sc.nextInt();
	int a[]=new int[size];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
		
	}
	int b=0;
	int d=0;
	for(int i=0;i<a.length;i++) {
		if(b<a[i]) {
			b=a[i];
			
		}System.out.println(b);
		
	}
}
}
