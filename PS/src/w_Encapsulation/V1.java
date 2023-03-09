package w_Encapsulation;

public class V1 {
	private String name;
	private int rollno;
	private int marks;
	
	public String getStudentName() {
		return this.name;
	}
	public int getStudentRollNo() {
		return this.rollno;
	}
	public int getStudentMarks() {
		return this.marks;
	}
	public void setStudentMarks(int marks) {
		this.marks=marks;
	}
	V1(String name,int rollno,int marks){
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}
	
	

}
