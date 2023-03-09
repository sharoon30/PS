package xa_string_class;

public class Reverse {
	 public static void main(String[] args) {
		String s="i live in bangalore  ";
		String a[]=s.split(" ");
		for(int i=a.length-1;i>=0;i--) {
				System.out.print(a[i]+" ");
		}
		
		
	/*	for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}*/
		
	}

}
