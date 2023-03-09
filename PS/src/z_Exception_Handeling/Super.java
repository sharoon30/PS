package z_Exception_Handeling;

public class Super extends Exception {
	 String msg;
	Super(String msg){
		this.msg=msg;
	}
	public String getMessage() {
		return msg;
	}

}
