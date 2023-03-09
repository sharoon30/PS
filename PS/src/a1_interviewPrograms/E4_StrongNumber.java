package a1_interviewPrograms;
public class E4_StrongNumber {
	public static void main(String[] args) {
		int number = 145;
		int temp=number;
		int sum=0;
		while(number>0) {
			int fact=1;
			int reminder=number%10;
			for(int i=reminder;i>=1;i--) {
				fact=fact*i;
			}
			sum=sum+fact;
			number=number/10;
		}
		if(sum==temp) {
			System.out.println("strong number "+sum);
		}
		else {
			System.out.println("not strong number");
		}	
	}
}