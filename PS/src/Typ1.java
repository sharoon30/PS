import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
public class Typ1 {
	public static void main(String[] args) {
		/*HashSet h=new HashSet();
		System.out.println(h.add(10));
		System.out.println(h.add(20));
		System.out.println(h.add(30));
		System.out.println(h.add(40));
		System.out.println(h.add(50));
		System.out.println(h.add(10));
		System.out.println(h.add(10));
		System.out.println(h.add("hi"));
		System.out.println(h.add("bye"));
		System.out.println(h);
		for(Object o:h)
		{
			System.out.println(o);
		}
		*/
		
		
		
		// converting Hashset to arraylist
		
		/*HashSet<Integer> h=new HashSet();
		h.add(100);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(60);
		h.add(40);
		h.add(90);
		h.add(460);
		
		System.out.println(h);
		
		
		ArrayList a=new ArrayList(h);
		Collections.sort(a);
		//for(Object o:a) {
			//System.out.println(o);
		//}
		System.out.println(a); */
		
		
		TreeSet t=new TreeSet();
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(40);
		t.add(7);
		t.add(12);
		t.add(15);
		 System.out.println(t);
		 
		 /*Iterator i =t.iterator();
		 while(i.hasNext())
		 {
			 System.out.println(i.next()+" ");
			 
		 }
		 System.out.println(); */
		 
		 // display in descending order
		 
		 Iterator i1=t.descendingIterator();
		 while(i1.hasNext())
		 {
			 System.out.println(i1.next()+" ");
		 }
		 
		
	}

}
