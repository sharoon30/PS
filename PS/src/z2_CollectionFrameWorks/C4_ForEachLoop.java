package z2_CollectionFrameWorks;

import java.util.ArrayList;

//retriving the data by using for each loop
public class C4_ForEachLoop {
	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add(10);
		a.add("samuel");
		a.add(true);
		for(Object o:a) {
			System.out.println(o);
		}
	}

}
