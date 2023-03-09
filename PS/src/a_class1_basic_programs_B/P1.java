package a_class1_basic_programs_B;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class P1 {
	int a;
	P1(int a){
		this.a=a;
	}	
	public static void main(String[] args) {
		P1 p1=new P1(10);
		P1 p2=new P1(20);
		p2.add();
		p2.sub();
	}
	void add() {
		System.out.println(this.a);
	}
	void sub() {
		this.add();
	}
}