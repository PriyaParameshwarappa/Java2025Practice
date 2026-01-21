package javaprograms;

import java.util.Scanner;

public class CheckForPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String st = sc.next();

		System.out.println("The String given is" + st);

		String stRev = "";

		for (int i = st.length() - 1; i >= 0; i--) {

			stRev += st.charAt(i);
		}
		System.out.println(stRev);
		
		if(st.equalsIgnoreCase(stRev)) {
			System.out.println("Given String is Palindrom");
		}else {
			System.out.println("Given String is not Palindrom");
		}

	}

}
