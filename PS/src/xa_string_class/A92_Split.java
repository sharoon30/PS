package xa_string_class;

public class A92_Split {
public static void main(String[] args) {
	String s="i live in bangalore ";
	String s1[]=s.split(" ");
	for(int i=0;i<s1.length;i++) {
		System.out.println(s1[i]);
	}
	for(int i=s1.length-1;i>=0;i--) {
		System.out.print(s1[i]+ " ");
	}
}
}
