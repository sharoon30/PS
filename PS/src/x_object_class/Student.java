package x_object_class;
public class Student {
	int marks;
	Student(int marks){
		this.marks=marks;
	}
	public boolean equals(Object obj) {
		return this.marks==((Student)obj).marks;
	}
	public int hashCode() {
		return this.marks+1000;
	}
	public static void main(String[] args) {
		Student s1=new Student(10);
		Student s2=new Student(20);
		Student s3=new Student(10);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}
}