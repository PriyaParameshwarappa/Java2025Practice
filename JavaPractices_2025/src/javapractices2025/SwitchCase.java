package javapractices2025;

public class SwitchCase {

	public static void main(String[] args) {
		String browser = "IE";

		switch (browser.trim().toLowerCase()) {
		case "chrome":
			System.out.println("Chrome Browser is launched");
			break;

		case "firefox":
			System.out.println("FireFox Browser is lauched");
			break;

		case "IE":
			System.out.println("IE Browser is lauched");
			break;

		case "Opera":
			System.out.println("Opera Browser is lauched");
			break;

		default:
			System.out.println("Plz enter valid browser name:" + browser);
			break;
		}

	}

}
