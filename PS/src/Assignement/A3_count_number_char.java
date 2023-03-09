package Assignement;

public class A3_count_number_char {
public static void main(String[] args) {
	String s="we live in bangalore";
	int count=0;
	char c[]=s.toCharArray();
	for(int i=0;i<c.length;i++) {
		count++;	
	}
	System.out.println(count);
}
}
