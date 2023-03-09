package za_Array_of_object;

public class A2 {
	String name ;
	int  a;
	A2(String name,int a){
		this.name=name;
		this.a=a;
		
	}
	public static void main(String[] args) {
		A2 a1=new A2("shae",5);
		A2 a2=new A2("rozar",6);
		A2 a3[]=new A2[3];
		a3[0]=a1;
		a3[1]=a2
;
		for(int i=0;i<a3.length-1;i++) {
			System.out.println(a3[i].a+" "+a3[i].name);
		}
			}

}
