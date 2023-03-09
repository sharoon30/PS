package za_Array_of_object;

public class A1 {
String a;
int b;

	
	A1(String a,int b){
		this.a=a;
		this.b=b;
	}
	public static void main(String[] args) {
		A1 a1=new A1("sharon",10);
		A1 a2=new A1("rozario",20);
		A1 a6[]=new A1[2];
		a6[0]=a1;
		a6[1]=a2;
		for(int i=0;i<a6.length;i++) {
			System.out.println(a6[i].a+" "+a6[i].b);
		}
	}

}
