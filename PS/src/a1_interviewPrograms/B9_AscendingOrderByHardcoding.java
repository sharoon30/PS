package a1_interviewPrograms;

public class B9_AscendingOrderByHardcoding {
	public static void main(String[] args) {
		int a[]= {40,59,60,46,3};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
