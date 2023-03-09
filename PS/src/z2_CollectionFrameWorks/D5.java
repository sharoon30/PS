package z2_CollectionFrameWorks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class D5 {
	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add(10);
		a.add(1);
		a.add(99);
		a.add(20);
		a.add(25);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
	}

}
