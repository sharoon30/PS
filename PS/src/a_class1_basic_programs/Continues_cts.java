package a_class1_basic_programs;
//skipping 2 numbers using cont
public class Continues_cts {
	public static void main(String[] args) {
		int i=0;
		while(i<=10)
		{
			if(i==6 || i==9) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
			
		}
	}

}
