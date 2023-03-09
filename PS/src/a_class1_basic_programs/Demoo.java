package a_class1_basic_programs;

import java.util.Arrays;

// to remove the duplicate character from a string 

public class Demoo {
	public static void main(String[] args) {
		String s1="omy name is sharoon oo o";
		char c[]=s1.toCharArray();
		int k=0;
		//traversing character array
		for(int i=0;i<c.length;i++) {
			int j;
			//check whether c[i] is present before or not 
			for( j=0;j<i;j++) {
				if(c[i]==c[j]) {
					break;
				}
			}
			//if the character is not present before , add it to resulting string 
			if(j==i) {
				c[k++]=c[i];
			}
		}
		System.out.println(String.valueOf(Arrays.copyOf(c, k)));
	}

}
