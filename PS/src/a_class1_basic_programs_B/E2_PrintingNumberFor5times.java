package a_class1_basic_programs_B;
public class E2_PrintingNumberFor5times {
public static void main(String[] args) {
	int num=3;
	int temp=num+5;
	String s1="";
	if(num>5) {
		for(int i=0;i<10;i++) {
			System.out.print(i);
		}
	}
	else {
		for(int i=0;i<10;i++) {
			if(num<temp) {
				for(int j=0;j<5;j++) {
				s1=s1+1;
				temp--;
				}
			}
			else
			{
				s1=s1+i;
			}
		}
		System.out.println(s1);
	}
}
}