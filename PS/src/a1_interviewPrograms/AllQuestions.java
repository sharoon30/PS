package a1_interviewPrograms;

public class AllQuestions {
	public static void main(String[] args) {
		AllQuestions a1=new AllQuestions();
		
	}
//To find a specific number whether it is a prime number 	
	public  void primeNumbers(int number) {
		int temp=number;
		boolean key=true;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				key=false;
				break;
			}
		}
		if(key==true) {
			System.out.println(number+": It is prime number");
		}
		else {
			System.out.println(number+": It is not a prime number");
		}
	}
//To find the range of prime numbers from the given range 	
	public  void rangeOfPrime(int start,int end) {
		for(int i=start;i<=end;i++) {
			boolean key=true;
			for(int j=2;j<start;j++) {
				if(i%j==0) {
					key=false;
					break;
				}
			}
			if(key==true) {
				System.out.println(i);
			}
		}
	}
//To find whether the given numbers is a armstrong number
	public void armstrongNumber(int number) {
		int temp=number;
		int temp1=number;
		int count=0;
		while(number!=0) {
			count++;
			number=number/10;
		}
		int sum=0;
		while(temp!=0) {
			int reminder=temp%10;
			sum=(int) (sum+Math.pow(reminder, count));
			temp=temp/10;
		}
		if(temp1==sum) {
			System.out.println(temp1+": It is a Armstrong number");
		}
		else {
			System.out.println(temp1+": It is not a armstrong number");
		}
		
	}
	//To find the fibonacci series 
	public void fibonacciSeries(int number) {
		int a=0;
		int b=1;
		int sum;
		int temp=0;
		System.out.println("The first "+number+" fibonacci series are:");
		for(int i=0;i<number;i++) {
			if(i==0 || i==1) {
				System.out.println(temp);
				temp++;
			}
			else {
				sum=a+b;
				System.out.println(sum);
				a=b;
				b=sum;
			}
		}
	}
	public void stringReverse(String s1) {
		String s2="";
		for(int i=0;i<s1.length();i++) {
			s2=s1.charAt(i)+s2;
		}
		System.out.println(s2);
	}
	//to check whether the given number is palindrome or not 
	public boolean checkPalindrome(int number) {
		int temp=number;
		int sum=0;
		while(number!=0) {
			int reminder=number%10;
			sum=(sum*10)+reminder;
			number/=10;
		}
		if(temp==sum) {
			return temp==sum;
		}
		else {
			return temp==sum;
		}
	}
	//to check whether the give string is palindrome or not
	public boolean checkPalindrome(String s1) {
		String s2="";
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			s2=c+s2;
		}
		if(s1.equals(s2)) {
			return s1.equals(s2);
		} else {
			return s1.equals(s2);
		}	
	}
	//count the number of character 
	public int countCharacter(String s1) {
		int count=0;
		for(int i=0;i<s1.length();i++) {
			if(Character.isAlphabetic(s1.charAt(i))) {
				count++;
			}
		}
		return count;
	}
	//Count the number of frequency of the character
	public void frequencyOfTheCharacter(String s1) {
		char c[]=s1.toCharArray();
		for(char c1='A'; c1<='z'; c1++) {
			int count=0;
			char check=c1;
			for(int i=0;i<c.length;i++) {
				if(check==c[i]) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(check+" "+count);
			}
		}
	}
	//Linear Search
	public boolean LinearSearch(int a[],int checkNumber) {
		boolean key=false;
		for(int i=0;i<a.length;i++) {
			if(checkNumber==a[i]) {
				key=true;
				break;
			}
		}
		if(key==true) {
			return true;
		}
		else {
			return false;
		}
	}
	//program to sort it in ascendingOrder
	public int[] AscendingOrder(int a[]){
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}	
		}
		return a;
	}
	//Program to count how many specified alphabet are there in a string
	public int countSpecifiedAlphabet(String s1,char check) {
		int count=0;
		for(int i=0;i<s1.length();i++) {
			if(check==s1.charAt(i)) {
				count++;
			}
		}
		return count;
	}
	//program to find the factorial of the given number
	public int factorial(int number) {
		int fact=1;
		for(int i=number;i>=1;i--) {
			fact=fact*i;
		}
		return fact;
	}
	//program to find the sum of each digit present in the given number 
	
	
}