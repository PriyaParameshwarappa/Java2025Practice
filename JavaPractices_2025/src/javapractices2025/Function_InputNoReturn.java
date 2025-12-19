package javapractices2025;

public class Function_InputNoReturn {
	// creating Input but no return

	public void sum(int a, int b) {
		System.out.println("Sum of two number ");
		int c = a + b;
		System.out.println(c);

	}

	public static void main(String[] args) {
		Function_InputNoReturn f=new Function_InputNoReturn();
		f.sum(100, 300);

	}

}
