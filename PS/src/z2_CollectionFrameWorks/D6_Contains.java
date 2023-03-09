package z2_CollectionFrameWorks;

import java.util.ArrayList;
import java.util.List;
//By using list INterface 
public class D6_Contains {
	public static void main(String[] args) {
		List i=new ArrayList<>();
		i.add(50);
		i.add("sharoon");
		i.add("15");
		i.add(50.6);
		System.out.println(i);
		System.out.println(i.contains(50));
	}

}
