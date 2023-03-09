package a_class1_basic_programs_B;
import java.util.Scanner;
public class Demo3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int num=3;
	int temp=num+5;
	String s1="";
	if(num>5) {
		for(int i=0;i<10;i++) {
			System.out.print(i);
		}
	}
	else {
		for(int i=0;i<10;i++) {
			if(num<temp) {
				for(int j=0;j<5;j++) {
				s1=s1+1;
				temp--;
				}
			}
			else
			{
				s1=s1+i;
			}
		}
		System.out.println(s1);
	}
}
}
