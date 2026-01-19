package interviewpreparation;

public class WAP_toChecktheStringLength_NotPrintIfLengthLessThan10 {
//Write a Java program to check whether the length of a given string is greater than 10 or not and print the result.
	public static void main(String[] args) {

		String s = "I love the coding;;;";
		int n=s.length();
		
		if(n>10) {
			System.out.println(n);
		}else {
			System.out.println("String length is not greater than 10");
		}
		
		

	}

}
