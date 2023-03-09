package z2_CollectionFrameWorks;

import java.util.ArrayList;

public class B2_AddingValuesInBetween {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(12);//0
		a.add("sharoon");//1
		a.add(25.5);//2
		System.out.println(a);
		a.add(2,"rozario");
		
		System.out.println(a);
		a.add(3,false);
		System.out.println(a);
		a.remove("sharoon");
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		a.add(12);
		System.out.println(a);
		a.remove(new Integer(12));
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println("Before for loop");
		for(int i=0;i<=a.size();i++) {
			a.remove(i);
		}
		System.out.println("after for loop");
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a);
		a.remove(0);
		System.out.println(a.isEmpty());
	}

}
