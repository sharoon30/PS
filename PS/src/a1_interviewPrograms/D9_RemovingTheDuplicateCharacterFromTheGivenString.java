package a1_interviewPrograms;
import java.util.Arrays;
import java.util.Scanner;
public class D9_RemovingTheDuplicateCharacterFromTheGivenString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string with duplicate character");
		String s1=sc.nextLine();
		char c[]=s1.toCharArray();	
		int index=0;
		for(int i=0;i<c.length;i++) {
			int j;
			for(j=0;j<i;j++) {
				if(c[i]==c[j]) {
					break;
				}
			}
			if(i==j) {
				c[index++]=c[i];
			}
		}
		System.out.println(String.valueOf(Arrays.copyOf(c, index)));
	}
}
