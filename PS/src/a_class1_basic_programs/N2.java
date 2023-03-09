package a_class1_basic_programs;

import java.util.ArrayList;
import java.util.HashSet;

public class N2 {
	public static void main(String[] args) {
		
		
		HashSet a=new HashSet();
		a.add(10);
		a.add(20);
		a.add(10);
		for(Object o:a) {
			System.out.println(o);
		}
		ArrayList h=new ArrayList(a);
		
	}
}
