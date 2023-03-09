package a_class1_basic_programs_B;

import java.util.PriorityQueue;
public class P2 {
	public static void main(String[] args) {
	PriorityQueue p=new PriorityQueue();
	p.add("tap");
	p.add("rat");
	p.add(10);//run time exception
	System.out.println(p);
	System.out.println("the next ele to be removed is "+p.peek());
		}
}
