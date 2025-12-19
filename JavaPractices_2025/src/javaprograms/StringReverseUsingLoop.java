package javaprograms;

import javax.management.RuntimeErrorException;

public class StringReverseUsingLoop {

	public static String reverse(String r) {
		
		//null check should be done at first
		if(r==null) {
			throw new RuntimeException("Value can not be null");
		}

		// EdgeCase1 when we have single char
		// Here we will unwanted go to the loop because having only one char
		// we are add one conditation and return same value to the funcation back 

		if (r.length() == 1 || r.length()==0) {
			return r;

		}

		int l = r.length();
		String revS = "";
		for (int i = l - 1; i >= 0; i--) {
			revS += r.charAt(i);
		}
		return revS;

	}

	public static void main(String[] args) {

		String str = "SeleniumInterview";
		String revS = reverse(str);
		System.out.println(revS);
		// Some edge case we can explain in interview
		// Case1::
		System.out.println(reverse("T"));
		//Case2:When user pass the null 
		//System.out.println(reverse(null));
		//Case3;When User pass the blank 
		System.out.println(reverse(""));
		//Case4 : What if we user give one single space hoe my code will handle 
		System.out.println(reverse(" "));
		//Case 5:
		System.out.println(reverse("456"));
		System.out.println(reverse("null"));
		//Case 6:: 
		System.out.println(reverse("testing "));
		
		

	}
}