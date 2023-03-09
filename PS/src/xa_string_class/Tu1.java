package xa_string_class;

public class Tu1 {
	public static void main(String[] args) {
		String s1="i am a testengineer";
		char c[]=s1.toCharArray();
		for(int i=0;i<c.length;i++) {
			String word="";
			if(c[i]=='i'||c[i]=='a') {
				word=word+c[i];
				System.out.print(word.toUpperCase());
			}
			else {
				System.out.print(c[i]);
			}
		}
	}

}
