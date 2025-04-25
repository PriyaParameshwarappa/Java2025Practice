package javapractices2025;

public class FindVowelsOrConsanents_Switch {

	public static void main(String[] args) {
		char ltr='f';
		
		switch (ltr) {
		case 'a':
			System.out.println("a is the vowel");			
			break;
		case 'e':
			System.out.println("e is the vowel");			
			break;
		case 'i':
			System.out.println("i is the vowel");			
			break;
		case 'o':
			System.out.println("o is the vowel");			
			break;
		case 'u':
			System.out.println("u is the vowel");			
			break;

		default:
			System.out.println(ltr +" is are consonunt");
			break;
		}
		int i=1;		
		switch (i) {
		case 0:
			System.out.println("On the fan");			
			break;
		case 1:
			System.out.println("OFF the fan");			
			break;
		default:
			System.out.println("Power off");
			break;
		}

	}

}
