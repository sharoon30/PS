package a_class1_basic_programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
public static void main(String[] args) {
	String s1="Rockey rockey rockey";
	char c[]=s1.toCharArray();
	int k=0;
	int count=0;
	for(int i=0;i<c.length;i++) {
		int j=0;
		for(j=0;j<i;j++) {
			if(c[i]==c[j]) {
				count++;
				break;
			}
		}
		if(i==j) {
			c[k++]=c[i];
			
		}
	}
	System.out.println(count);
	System.out.println(String.valueOf(Arrays.copyOf(c, k)));
}
}
