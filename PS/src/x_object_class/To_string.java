package x_object_class;

public class To_string {
	String name="Rozario";
	public static void main(String[] args) {
		To_string t1=new To_string();
		System.out.println(t1);
		System.out.println(t1.toString());
		
	}
	public String toString() {
		return " "+this.name;
	}
	

}
