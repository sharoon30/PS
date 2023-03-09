package a_class1_basic_programs;
//write a program to print the numbers from 10 to 20 skipping 13 and 18
public class Skipnumb {
	public static void main(String[] args) {
		int i;
		for(i=10;i<=20;i++) {
			if(i==13||i==18) {
				
				i++;
				continue;
				
			}
			System.out.println(i);
		}
	}

}
