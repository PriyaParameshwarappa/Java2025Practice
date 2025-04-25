package javapractices2025;

public class Print_ASCII_Table {

	public static void main(String[] args) {
		for(int i='a';i<='z';i++) {
			System.out.println(i);
			
		}

		for(char ch='A';ch<='z';ch++) {
			System.out.println(ch + " = " + (byte)ch);
		}
		
		
		
	}

}
