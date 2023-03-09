package a1_interviewPrograms;

public class E8_ElfSplitNumberAndAdd {
	public static void main(String[] args) {
		String value="ELF36JULY2022DATE29";
		String numbersOnly="0";
		int sum=0;
		for(int i=0;i<value.length();i++) {
			char c=value.charAt(i);
			if(c>='0'&&c<='9') {
				numbersOnly=numbersOnly+c;
			}
			else{
				sum=sum+Integer.parseInt(numbersOnly);
				numbersOnly="0";
			}
			
		}
		sum=sum+Integer.parseInt(numbersOnly);
		System.out.println(sum);
		
	}

}
