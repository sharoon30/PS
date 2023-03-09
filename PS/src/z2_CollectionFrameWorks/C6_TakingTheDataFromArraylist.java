package z2_CollectionFrameWorks;

import java.util.ArrayList;
import java.util.Iterator;

//3rd approach to get the data is by using Iterator
public class C6_TakingTheDataFromArraylist {
public static void main(String[] args) {
	ArrayList a=new ArrayList<>();
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(40);
	
	Iterator i= a.iterator();
	
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
}
}
