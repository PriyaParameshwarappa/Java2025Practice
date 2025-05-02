package javapractices2025;

public class PrintPatternwithloops {

	public static void main(String[] args) {
		//000 001 002 003
		//100 111 122 133
		//200 211 222 223
		//300 311 322 333
		
		   for (int i = 0; i <= 3; i++) {
	            for (int j = 0; j <= 3; j++) {
	                System.out.printf("%d%d%d\t", i, j, j);
	            }
	            System.out.println();
	        }
		   
		
		
		

	}

}
