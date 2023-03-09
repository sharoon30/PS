package z2_CollectionFrameWorks;

import java.util.ArrayList;
import java.util.List;

//Index Of is used in order to get the index of the given object  
public class D9_IndexOf {
	public static void main(String[] args) {
		List i=new ArrayList<>();
		i.add(10);
		i.add("sharun");
		i.add(true);
		
		i.add("sharun");
		i.add(20.5);
		i.add('c');
		
		System.out.println(i.lastIndexOf("sharun"));
	}
	
}
