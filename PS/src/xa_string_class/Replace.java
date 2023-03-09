package xa_string_class;
public class Replace {
	public static void main(String[] args) {
		String s1="my name is ram";
		System.out.println(s1);//original string
		s1=s1.replace("ram", "sham");
		System.out.println(s1);//after replacing the string
		s1=s1.replace(" ", "");//after removing the space
		System.out.println(s1);
	}
}