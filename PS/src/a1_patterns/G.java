package a1_patterns;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class G {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.nextLine();
		String name = "";
		String dupRemoved="";
		LinkedHashSet<Character> l1 = new LinkedHashSet<Character>();
		char extract = s1.charAt(0);
		int key=0;
		if(extract >= 'A' && extract <= 'Z') {
			key = 1;
		}
		else {
			key = 2;
		}
		switch(key) {
		case 1:
			for(int i=0;i<s1.length();i++) {
				char var = s1.charAt(i);
				if(i==0) {
					String dum = ""+var;
					name = name + dum.toLowerCase();
				}
				else {
					String dum = ""+var;
					name = name + dum.toUpperCase();
				}
			}
			for(int i=0;i<name.length();i++) {
				char var = name.charAt(i);
				l1.add(var);
			}
			for(Character var : l1) {
				dupRemoved+=var;
			}
			break;
		case 2:
			for(int i=0;i<s1.length();i++) {
				char var = s1.charAt(i);
				if(i==0) {
					String dum = ""+var;
					name = name + dum.toUpperCase();
				}
				else {
					String dum = ""+var;
					name = name + dum.toLowerCase();
				}
			}
			for(int i=0;i<name.length();i++) {
				char var = name.charAt(i);
				l1.add(var);
			}
			for(Character var : l1) {
				dupRemoved+=var;
			}
			break;
		}
		System.out.println(dupRemoved);
	}
}
