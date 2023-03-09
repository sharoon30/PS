package xa_string_class;

public class Abc {
	public static void main(String[] args) {
		
	String s= "live i bye live live bad boy live";
    String word="live";
    String arr[]=s.split(" ");
        int count=0;
    for(int i=0;i<arr.length;i++) {
    	if(arr[i].equals(word))
    	{
    		count++;
    	}
    	}
    System.out.println(count);
	}

}
