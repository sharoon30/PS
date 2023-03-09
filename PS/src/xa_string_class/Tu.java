package xa_string_class;

public class Tu {
	public static void main(String[] args) {
		String s="i am a testengineer";
		char c[]=s.toCharArray();
		String sentence="";
		for(int i=0;i<c.length;i++) {
			if(c[i]=='i'||c[i]=='a') {
				String word=""+c[i];
				sentence=sentence+word.toUpperCase();
			}
			else {
				sentence=sentence+c[i];
			}
		}
		System.out.println(sentence);
	}
}

