package a_class1_basic_programs;
//program to print odd numbers from 200 to 100 in between if there is any odd numbers divisible by 3 or 5 stop printing 
public class Patterns_4 {
	public static void main(String[] args) {
		int i;
		for(i=200;i>=100;i--)
		{
			if(i%2!=0) {
				if(i%3!=0&&i%5!=0) {
				    break;
				}
				
				System.out.println(i);
				
				
			}
		}
	}

}
