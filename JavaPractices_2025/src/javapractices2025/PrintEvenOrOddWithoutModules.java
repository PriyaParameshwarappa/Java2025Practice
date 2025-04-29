package javapractices2025;

public class PrintEvenOrOddWithoutModules {

	public static void main(String[] args) {
		for(int k=1;k<=10;k++) {
			k++;
			System.out.println("When I incremented before the stmt i will be even number " + k );
		}
		
		for (int p=1;p<=10;p++) {
			System.out.println("When I incremented after the stmt i will be odd  number " + p);
			p++;
		}

	}

}
