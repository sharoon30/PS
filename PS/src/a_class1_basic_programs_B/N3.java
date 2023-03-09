package a_class1_basic_programs_B;

import java.util.TreeSet;

public class N3 {
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add("hey");
		t.add("bye");
		t.add("apple");
		t.add("hey");
	    t.add(10);//RTE
		System.out.println(t);
	}
}
