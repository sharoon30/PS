package z2_CollectionFrameWorks;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class E3_RemovingDuplicates {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(10);
		a.add(40);
		a.add(10);
		TreeSet t=new TreeSet(a);
		System.out.println(t);
	}
}
