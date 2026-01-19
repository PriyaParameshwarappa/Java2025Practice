package interviewpreparation;

public class WAP_CompairToString_FindTheyAreEqualOrNot {
//Write a Java program to compare two strings and check whether they are equal or not.
	public static void main(String[] args) {
		String s="Priya is worlds best coder";
		String t="Aadhya is worlds best coder";
		
		if(s.equalsIgnoreCase(t)) {
			System.out.println("String is equal");
		}else {
			System.out.println("String is not equal");
		}
		

	}

}
