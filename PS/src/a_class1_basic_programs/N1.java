package a_class1_basic_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public class N1 {
	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet<Integer>();
		h.add(20);
		h.add(40);
		h.add(30);
		h.add(10);
		h.add(50);
		h.add(30);
		h.add(10);
		System.out.println(h);
		System.out.println(h);
		ArrayList a=new ArrayList(h);
		Collections.sort(a);
		for(Object o:a) {
			System.out.println(o);
		}
	}
}
