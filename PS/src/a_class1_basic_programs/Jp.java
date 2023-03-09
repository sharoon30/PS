package a_class1_basic_programs;
import java.util.LinkedList;
public class Jp {
	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		li.add(true);
		li.add(false);
		li.add("hey");
		li.add(10);
		li.add(2,"Dboss");
		li.add(4,"Ro");
		li.addLast(70);
		System.out.println(li);
		li.removeFirst();
		System.out.println(li);
		li.removeLast();
		System.out.println(li);
	}
}