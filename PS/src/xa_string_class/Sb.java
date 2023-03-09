package xa_string_class;

public class Sb {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("java");
		StringBuffer sb1=new StringBuffer("java");
		System.out.println(sb);
		System.out.println(sb1);
		System.out.println(sb.equals(sb1));
		//StringBuffer sb2="hello";//invalid throws CTE
		sb.append("development");
		System.out.println(sb);//java development
		sb1.append("class");//javaclass
		String sb2="tiger";// used to concatination
		sb1.append(sb2);//javaclasstiger
		System.out.println(sb1);
	}
}
