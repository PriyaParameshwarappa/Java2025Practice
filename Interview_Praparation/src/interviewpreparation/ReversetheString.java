package interviewpreparation;

import java.util.Iterator;

public class ReversetheString {
	
	public static void main (String[] args) {
		
		String s="WEL COME TO INDIA";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			rev+=s.charAt(i);
		}
		
		System.out.println("Orignial String" + "=="+ s);
		System.out.println("Reversed String" + "=="+ rev);

	}

}
