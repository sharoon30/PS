package a1_interviewPrograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class C4_CountTheAlphabetByLinkedHashMap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s1=sc.nextLine();
		s1=s1.replace(" ", "");
		LinkedHashMap<Character,Integer> l=new LinkedHashMap<Character, Integer>();
		char c[]=s1.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(!l.containsKey(c[i])) {  
				l.put(c[i], 1);
			}
			else {
				int x=l.get(c[i]);
				x++;
				l.put(c[i], x);
			}
		}
		for(Entry e:l.entrySet()) {
			System.out.println(e);
		}
		
		
	}

}
