package z2_CollectionFrameWorks;

import java.util.ArrayList;
//to get the values from the arraylist we use get method
public class C3_GettingTheValuesFromArraylist {
	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);	
		a.add("kannan");
		a.add(true);
		a.add(65.98);
		a.add('r');
//		System.out.println(a.get(5));
		for(int i =0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
	}

}
