package z2_CollectionFrameWorks;

import java.util.LinkedList;

public class E2_LinkedList {
	public static void main(String[] args) {
		LinkedList li=new LinkedList<>();
		li.add("kannan");
		li.add(21);
		li.add(true);
		li.add(69.96);
		li.add('C');
		System.out.println(li);
		li.addFirst("karunya mer-c");
		System.out.println(li);
		li.addLast("vengi");
		System.out.println(li);
		System.out.println(li.getFirst());
		System.out.println(li.getLast());

		
		
	}

}
