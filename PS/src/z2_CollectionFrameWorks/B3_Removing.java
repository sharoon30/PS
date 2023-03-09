package z2_CollectionFrameWorks;

import java.util.ArrayList;
import java.util.Iterator;

public class B3_Removing {
	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		System.out.println(a.isEmpty());
		System.out.println(a);
		int j=a.size();
		int i=1;
		while(i<=j) {
		a.remove(0);
		System.out.println(a);
		i++;
		}
		System.out.println();
		
		
		
	
	
	}

}
