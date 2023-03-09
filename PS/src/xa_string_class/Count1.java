package xa_string_class;

public class Count1 {
	public static void main(String[] args) {
		String word="live";
		String s="live live hi man live live";
		int count=0;
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++) {
			if(s1[i].equals(word)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
