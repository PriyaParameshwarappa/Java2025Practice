package StringManipulation;

public class StringCompare {

	public static void main(String[] args) {
		//String Literals 
		String s1="hello Selenium";// We will this has String literals
		String s2=new String("hello Selenium");// Crated Objected of the String
		// == will check the object references 
		// .equals check the contant of the String
		
		
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//True
		
		String s3="hello Selenium";
		System.out.println(s1==s3);//True because comparing happing with two literals 
		
		System.out.println(s2.equals(s3));
				
		
		
		
		
		
		
		
		
		
		

	}

}
