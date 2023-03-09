package Assignement;

public class B2 {
	public static void main(String[] args) {
	String s1="GC18ELF35SELENIUM2022JUNE09";
	String s2=s1.substring(0,4);
	String s3=s1.substring(5, 10);
	String s4=s1.substring(11, 22);
	String s5=s1.substring(23, s1.length());
	String elf="";
	String number="";
	String year="";
	String day="";
	for(int i=0;i<s2.length();i++) {
		if(Character.isDigit(s2.charAt(i))) {
			elf=elf+s2.charAt(i);
		}
	}
	int elf1=Integer.parseInt(elf);
	for(int i=0;i<s3.length();i++) {
		if(Character.isDigit(s3.charAt(i))) {
			number=number+s3.charAt(i);
		}
		
	}
	int number1=Integer.parseInt(number);
	for(int i=0;i<s4.length();i++) {
		if(Character.isDigit(s4.charAt(i))) {
			year=year+s4.charAt(i);
		}
	}
	int year1=Integer.parseInt(year);
	for(int i=0;i<s5.length();i++) {
		if(Character.isDigit(s5.charAt(i))) {
			day=day+s5.charAt(i);
		}
	}
	int day1=Integer.parseInt(day);
	int sum=elf1+number1+year1+day1;
	System.out.println(sum);
	}
}
