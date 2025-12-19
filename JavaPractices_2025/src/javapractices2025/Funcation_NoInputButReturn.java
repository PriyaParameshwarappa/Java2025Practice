package javapractices2025;

public class Funcation_NoInputButReturn {

	// no input but return
	public int getNumber() {
		System.out.println("get Number");
		int fee = 10;
		int tax = 20;
		int totalfee = fee + tax;
		return totalfee;
	}

	// Example 2 ::String return
	public String getTrainerName() {
		System.out.println("The Trainer name given");
		return "Naveen";
	}

	// Example 3 :: Boolen retuen

	public boolean isUserActive() {
		System.out.println("Checking user status");
		return true;
	}

	public static void main(String[] args) {

		Funcation_NoInputButReturn n = new Funcation_NoInputButReturn();
		int num = n.getNumber();
		System.out.println(num);

		String trainer = n.getTrainerName();
		if (trainer.equalsIgnoreCase("Naveen")) {
			System.out.println("Consisder trainer  " + n.getTrainerName() + " for Training");
		} else {
			System.out.println("Donot Consisder for Training");
		}

		boolean flag = n.isUserActive();
		if (flag == true) {
			System.out.println("Login to Application");
		} else {
			System.out.println("Do not login to application");
		}

	}
}
