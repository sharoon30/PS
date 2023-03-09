package a_class1_basic_programs;
import java.util.Scanner;
public class Amstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int no=sc.nextInt();
	int len=0;
	int no1=no;
	while(no!=0) {
		len=len+1;
		no=no/10;
	}
	int mul=1;
	int t3=no;
	int rem=0;
	int arm=0;
	while(no1!=0) {
		rem=no1%10;
		for(int i=0;i<=len;i++) {
			mul=mul*rem;
		}
		arm=arm+mul;
		no1=no1/10;
	}
	if(arm==no) {
		System.out.println(t3+"arm strong number");
	}
	else {
		System.out.println(t3+"not a armstrong number");
	}
	}

}
