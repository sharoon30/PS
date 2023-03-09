package Assignement;

import java.util.ArrayList;

public class B4 {
	public static void main(String[] args) {
		String s1 = "1234GC18ELF35SELENIUM2022JUNE09";
		int sum = 0;
		String b = "";
		ArrayList lst = new ArrayList();
		char a[] = s1.toCharArray();
		for (int i = 0; i <= a.length - 1; i++) {

			if (Character.isDigit(a[i])) {
				b = b + a[i];
			} else {
				if (b != "") {
					lst.add(b);
				}
				b = "";
			}
		}
		lst.add(b);
		System.out.println(lst);

		for (Object o : lst) {
			String s2 = (String) o;
			int i = Integer.parseInt(s2);
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
