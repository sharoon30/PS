package a_class1_basic_programs;

public class ProductException extends Exception {
String msg;
public ProductException(String msg) {
	this.msg=msg;
}
public String getmsg() {
	return msg;
}
}
