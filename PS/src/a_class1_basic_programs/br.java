package a_class1_basic_programs;

public class br {
	public static void main(String[] args) {
		int i=0;
		while(i<10) {
			if(i==5||i==8) {
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

}
