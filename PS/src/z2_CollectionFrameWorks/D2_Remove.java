package z2_CollectionFrameWorks;

import java.util.ArrayList;

//removeAll();
public class D2_Remove {
	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		System.out.println(a);
		int i=0;
		int size=a.size();
		while(i<size) {
			a.remove(0);
			i++;
		}
		System.out.println(a);	
	}
	

}
