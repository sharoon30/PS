package a1_interviewPrograms;
import java.util.ArrayList;
public class F1_MissingOfMultipleNumbersInAnArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int num=0;
		int j=0;
		ArrayList a1 = new ArrayList();
		for(int i=arr[0];i<=arr[arr.length-1];i++) {
			if(i==arr[j]) {
				j++;
				continue;
			}
			else{
				a1.add(i);
			}
		}
		System.out.println(a1);
	}
}
