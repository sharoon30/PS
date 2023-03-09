package a_class1_basic_programs;
import java.util.*;
public class Elseif_dms {
	public static void main(String[] args) {
		int temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("enter the values ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("the largest number among the three are ");
		for(int i=0;i<a.length;i++)
		{
			for(int k=i+1;k<a.length;k++) {
				if(a[i]>a[k]) {
					temp=a[i];
					a[i]=a[k];
					a[k]=temp;
				}
			}
		}
		
		

	}
	}
