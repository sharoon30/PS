package MyStringMethods;

import java.util.ArrayList;

public class Dhara {
	public static void main(String[] args) {
		String s1="sharoon Rozario";
		char arr[]=s1.toCharArray();
		ArrayList<Character> a1=new ArrayList();
		for(char var : arr) {
			a1.add(var);
		}
		for(char var : a1) {
			int count = 1;
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)==var) {
					count++;
				}
			}
			System.out.println(var+" "+count);
		}
	}
}
