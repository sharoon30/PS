package z_Exception_Handeling;

public class D1_Finally {
	//throw and finally block
	
	public static void main(String[] args) {
		
	
		try {
			System.out.println("statement 1");
			System.out.println("statement 2");
			System.out.println(3/0);//exception 
			System.out.println("statement 4");
			System.out.println("statement 5");
		}
		catch(Exception e) {
			System.out.println("statement 6");			
		}
		finally{
			System.out.println("hey ");
		}
	}

}
