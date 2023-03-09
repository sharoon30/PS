package a_class1_basic_programs;
import java.util.LinkedHashSet;
public class N4 {
	public static void main(String[] args) {
		LinkedHashSet li=new LinkedHashSet();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(40);
		li.add(20);
		li.add("hetero");
		System.out.println(li);
	}
}