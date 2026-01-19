package interviewpreparation;

public class WAP_ReverseTheString {

	public static void main(String[] args) {
	//Program Name: Reverse a String
		
		String s="Codeing make me think and make me happy";
		int n=s.length()-1;
		String rString="";
		
		for(int i=n;i>=0;i--) {
			rString+=s.charAt(i);
			
			
		}
		System.out.println(rString);
		

	}

}
