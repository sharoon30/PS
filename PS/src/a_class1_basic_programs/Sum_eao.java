package a_class1_basic_programs;

public class Sum_eao {
	public static void main(String[] args) {
		int j=0,k=0;
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				j=j+i;
			}
			else if(i%2!=0)
			{
				k=k+i;
			}
		}System.out.println(j);
		System.out.println(k);
	}

}
