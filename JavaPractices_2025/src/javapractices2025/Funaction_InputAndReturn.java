package javapractices2025;

public class Funaction_InputAndReturn {
	
	public int addition(int a,int b) {
		System.out.println("Addition of two number is ");
		int s=a+b;
		return s;
				
	}

	public static void main(String[] args) {
		Funaction_InputAndReturn num=new Funaction_InputAndReturn();
		int sum=num.addition(899,388);
		System.out.println(sum);
		
		

	}

}
