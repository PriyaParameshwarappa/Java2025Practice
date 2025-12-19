package javapractices2025;

public class MethodOverloading_Browser {

	public void click(String element) {
		System.out.println("clcik on the element" + element);
	}

	public void sendKeys(String element, String value) {
		System.out.println("Send value to element" + element + value);
	}

	public String getTitle(String element) {
		return "google";
	}

	// Based on the real time , how we write the funcation
	// WAF:: For Lauching Browser(String browser)
	// browser name : chrome,firfox,edge,safri
	// return :: print successfull message and return boolean[true/false]
// by this funcation we have understood how to add return /how to handle flag true and false 
	// before we write any funaction we should consider all these points and we need to write the code 
	public boolean lauchBrowser(String browserName) {

		System.out.println("Browser name:: " + browserName);
		boolean flag = true;

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launching browser successfull ");
			break;

		case "firefox":
			System.out.println("launching browser successfull ");
			break;

		case "edge":
			System.out.println("launching browser successfull ");
			break;
			
		case "safari":
			System.out.println("launching browser successfull ");
			break;
			
			default:
				System.out.println("Please enter valid browser name::" + browserName);
				flag=false;
				break;
			
	}
		return flag;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading_Browser b=new MethodOverloading_Browser();
		boolean exc=b.lauchBrowser("xyz");
		
		if(exc==true) {
			
			System.out.println("Browser opened successfully");
		}
		

	}

}
