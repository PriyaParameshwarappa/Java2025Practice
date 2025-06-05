package javapractices2025;

public class ElseIf {

	public static void main(String[] args) {
		String browser="chrome";
		
		if(browser.equals("chrome")) {
			System.out.println("chrome is lanch");			
		}else if (browser.equals("IE")) {
			System.out.println("IE is Launch");
		}else if(browser.equals("firefox")) {
			System.out.println("FireFox is Launch");
		}else {
			System.out.println("==Invalid Browser======");
		}
		

	}

}
