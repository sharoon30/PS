package a_class1_basic_programs_B;

import java.util.LinkedList;

public class P3 {
	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		li.offer(10);
		li.add(20);
		li.add(10);
		li.add(6);
	    li.add("pass");
	    System.out.println(li);
	  //  System.out.println(li.poll());
	    while(!(li.isEmpty())) {
	    	System.out.println(li.poll());
	    }
	}
}
