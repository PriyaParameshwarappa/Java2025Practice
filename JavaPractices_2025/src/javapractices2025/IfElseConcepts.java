package javapractices2025;

public class IfElseConcepts {

	public static void main(String[] args) {
		
		//IfElseConcepts		
		System.out.println(10==20);
		
		int a=30;
		int b=40;
		
		if(a>b) {
			System.out.println("a is greater");
		}else {
			System.out.println("B is greater ");
		}
		
	//=======================================not completed but it is always true 
		if(true) {
			System.out.println("RUN the Code");
		}
		//=======================compalted but dead code 
		if (false) {
			System.out.println("COde will not reach here because of death code");
		}
		
		// ======================to Over come this we need store true/false in variable =====
		boolean flag =true;
		
		if(flag) {
			System.out.println("======HI PRIYA PARAMESHWARAPPA");
		}else {
			System.out.println("====================BYE PRIYA PARAMESHWARAPPA==========");
		} 
		
		//========================================
		
		boolean isHeadless=true;
		
		if(isHeadless) {
			System.out.println("==Run the Testcases in headless mode==");
			
		}else {
			System.out.println("=====Run the Testcases in normal mode===");
		}
		
		
		
		
		
		

	}

}
