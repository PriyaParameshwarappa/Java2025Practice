package javapractices2025;

public class Funcation_Methods_NOInputNoReturn {
	
	//no input and no return 
	
	public void test() {
		System.out.println("This is my void method");
	}
	
	public void sumOfNumbers() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		//its non static funcation so we need to call by creating Object of class 
		
		Funcation_Methods_NOInputNoReturn r=new Funcation_Methods_NOInputNoReturn();
		r.test();
		r.sumOfNumbers();
		
	

	}

}
