package javapractices2025;

public class DOwhileLoop {

	public static void main(String[] args) {
	//Print 1 to 10 
		
		int i=1;
		
		do {
			System.out.println("Value of i is:" + i);
			i++;
		}while(i<=10);
		
		System.out.println("=================================");
		
		int p=10;
		do {
			System.out.println(p);
			p--;
			
			if(p==7) {
				System.out.println("Print i am P value is 7");
			}
		}while(p>=0);
		
		
		
		
	}

}
