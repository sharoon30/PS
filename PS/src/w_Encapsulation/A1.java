package w_Encapsulation;
//program on encapsulation 
public class A1 {
	private String name;
	private int eid;
	private String designation;
	private int sal;
static	int count;
	A1(String name,int eid, String designation,int sal){
		this.name=name;
		this.eid=eid;
		this.designation=designation;
		this.sal=sal;
		count++;
			}
	public String getName() {
		return this.name ;
	}
	public int getEid() {
		return this.eid ;
	}
	public String getDesignation() {
		return this.designation;
	}
	public int getSal() {
		return this.sal;

	}
	public void setSal(int sal) {
		if(sal>this.sal) {
			this.sal=sal;
		}
	}
}

