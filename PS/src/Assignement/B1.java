package Assignement;

public class B1 {
	public static void main(String[] args) {
		int arr[]= {12,34,10,8,45,68,33,90,73};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}System.out.println("the smallest no in an array is "+arr[0]+" the largest number is "+arr[arr.length-1]);
		
	}

}
