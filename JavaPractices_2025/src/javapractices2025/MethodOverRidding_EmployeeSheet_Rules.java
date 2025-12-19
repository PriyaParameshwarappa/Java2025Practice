package javapractices2025;

public class MethodOverRidding_EmployeeSheet_Rules {
	
	public void test() {
		System.out.println("This Method without Parameter");
	}
	
	public void test(int a) {
		System.out.println("This Method single Parameter");
	}
	public void test(int a,int b) {
		System.out.println("This Method two or more  Parameter");
	}
	
	public void test(String a,int c,int b) {
		System.out.println("This Method two or more with different datatype  Parameter");
	}
	
	public void test(String a,String b) {
		System.out.println("This Method two or more  Parameter");
	}
	
	public void test(String x,int y) {
		System.out.println("This Method with different sequence Parameter");
	}
	
	public void test(int y,String z) {
		System.out.println("This Method with different sequence Parameterr");
	}
	
	public String test(int r,String s,int o) {
		System.out.println("This Method with retuen  sequence Parameterr");
		return "Pass";
	}
	

	public static void main(String[] args) {
		
		MethodOverRidding_EmployeeSheet_Rules t=new MethodOverRidding_EmployeeSheet_Rules();
		t.test();
		t.test(10);
		t.test("Priya", 35);
		t.test("Aadhya", 8, 600);
		String studentstatus=t.test(50, "Khusi", 120);
		System.out.println();
		
	}

}
