package z2_CollectionFrameWorks;

import java.util.ArrayList;

public class B1_AddingValuesInsideArrayList {
	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add("Kannan");
		a.add('r');
		a.add(10);
		a.add(true);
		a.add(10.7);
		System.out.println(a);
		System.out.println(a.size());
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		
	}

}
