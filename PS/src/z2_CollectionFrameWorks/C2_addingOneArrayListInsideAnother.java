package z2_CollectionFrameWorks;

import java.util.ArrayList;

//adding one array list inside another array list
//3nd method to add
public class C2_addingOneArrayListInsideAnother {
	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);		
		System.out.println(a);
		ArrayList a1=new ArrayList<>();
		a1.add("karunya");
		a1.add(50);
		a1.addAll(a);//3nd approach
		System.out.println(a1);
		System.out.println(a1.size());
	}

}
