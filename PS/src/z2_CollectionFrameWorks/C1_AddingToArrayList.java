package z2_CollectionFrameWorks;
import java.util.ArrayList;
import java.util.Scanner;
public class C1_AddingToArrayList {
	public static void main(String[] args) {
		//adding the element in between the objects present in the array list ;
		ArrayList a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add("Mercy");
		a.add(true);
		a.add(69.6);
		a.add('a');
		a.add(-1520);
		System.out.println(a);
		int size=a.size();		
		System.out.println("the size before adding new elemnt in between is "+size);
		//adding objects in between the elemnt 
		a.add(3,"karunya");		
		System.out.println("After the object is added:");
		System.out.println(a);
		
	}

}
