package z2_CollectionFrameWorks;

import java.util.ArrayList;
import java.util.Scanner;

public class E1_Set {
	public static void main(String[] args) {
		ArrayList i=new ArrayList<>();
		i.add(10);
		i.add("sharun");
		i.add(true);
		i.add("sharun");
		i.add(20.5);
		i.add('c');
		System.out.println(i);
		i.set(3, "karunya");
		System.out.println(i);
	}	
}
