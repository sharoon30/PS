package za_Array_of_object;
public class Student {
	String name;
	int rollno;
	static   int count=0;
	Student(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
	count++;
	}
	public String toString() {
		return "Name:"+this.name+" "+" RollNo:"+this.rollno;
	}
	public static void main(String[] args) {
		Student s1=new Student("sharoon",101);
		Student s2=new Student("rozario",102);
		Student s3=new Student("neha",103);
		Student s4=new Student("reddy",104);
		Student s[]=new Student[count];
		s[0]=s1;
		s[1]=s2;
		s[2]=s3;
		s[3]=s4;
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}
}
