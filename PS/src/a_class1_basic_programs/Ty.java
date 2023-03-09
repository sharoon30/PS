package a_class1_basic_programs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
public class Ty {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		System.out.println(a);
		a.removeAll(a);
		System.out.println(a);
		ArrayList a2=new ArrayList();
		a2.add(20);
		a2.add(30);
		
		System.out.println(a2);
		a2.retainAll(a);
		System.out.println(a2);
	}
}