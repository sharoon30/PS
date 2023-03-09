package z2_CollectionFrameWorks;

import java.util.ArrayList;

public class D4_RetainAll {
	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		System.out.println(a);
		ArrayList a1=new ArrayList<>();
		a1.add(40);
		a1.add(50);
		a1.add(10);
		a1.add(20);
		System.out.println(a1);
		a1.retainAll(a);
		System.out.println(a1);
		
		
		

	}

}
