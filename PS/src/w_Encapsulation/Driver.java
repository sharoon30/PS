package w_Encapsulation;

public class Driver {
	public static void main(String[] args) {
		A1 a1=new A1("sharun",01,"test engg",50000);
		A1 a2=new A1("anish",02,"test engg",60000);
		Dis(a1);
		Dis(a2);
		System.out.println(" the count is "+A1.count);
		
	}
static void Dis(A1 a) {
		System.out.println(a.getName());
		System.out.println(a.getEid());
		System.out.println(a.getDesignation());
		System.out.println(a.getSal());
		//System.out.println("the number of employes are :"+a.coun);
		
	
}

}
