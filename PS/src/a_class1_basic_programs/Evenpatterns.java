package a_class1_basic_programs;
//program to print even patterns 
public class Evenpatterns {
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=8;i++)
		{
			if (i%2==0) {
				for(j=1;j<=8;j++)
				{
					if(j%2==0) {
					System.out.print(j+" ");	
					}
					
				}System.out.println();
			}
		}
	}

}
