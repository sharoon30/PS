package g_contructor;

public class A3 {
int a=10;
public static void main(String[] args) {
	A3 a3=new A3(20);
	
}
A3(int a){
	
	int c=a+this.a;
	System.out.println(c);
}


}
