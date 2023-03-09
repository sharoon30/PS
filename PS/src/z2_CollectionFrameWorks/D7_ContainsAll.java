package z2_CollectionFrameWorks;

import java.util.ArrayList;
import java.util.List;
//Used to check whether all the array list contains all the element of the given arraylist 
public class D7_ContainsAll {
	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		
		a.add(50);
		a.add(30);
		a.add(70);
		a.add(20);
		a.add(10);
		a.add(40);
		a.add("kannan");
		a.add(true);
		ArrayList a1=new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add("Kannan");
		a1.add(true);
		//a1.add(40);
		System.out.println(a.containsAll(a1));
	}

}
