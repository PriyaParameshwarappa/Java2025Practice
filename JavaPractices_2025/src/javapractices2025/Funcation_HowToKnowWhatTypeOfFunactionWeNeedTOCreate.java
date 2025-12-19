package javapractices2025;

public class Funcation_HowToKnowWhatTypeOfFunactionWeNeedTOCreate {

	public int getCustomerMarks(String customerName) {

		System.out.println("Customer name is = " + customerName);
		if (customerName.trim().equalsIgnoreCase("Priya")) {
			return 596;
		} else if (customerName.trim().equalsIgnoreCase("Aadhya")) {
			return 599;
		} else if (customerName.trim().equalsIgnoreCase("Khusi")) {
			return 589;
		} else {
			System.out.println("Please Enter valid Customer Name...." + customerName);
			return -1;
		}

	}

	// Second approach of writing same function

	public int ggetCustomerMarks(String customerName) {

		System.out.println("Customer name is = " + customerName);

		int marks = -1;

		if (customerName.trim().equalsIgnoreCase("Priya")) {
			marks = 596;
		} else if (customerName.trim().equalsIgnoreCase("Aadhya")) {
			marks = 599;
		} else if (customerName.trim().equalsIgnoreCase("Khusi")) {
			marks = 589;
		} else {
			System.out.println("Please Enter valid Customer Name...." + customerName);

		}
		return marks; 

	}

	public static void main(String[] args) {
		Funcation_HowToKnowWhatTypeOfFunactionWeNeedTOCreate c = new Funcation_HowToKnowWhatTypeOfFunactionWeNeedTOCreate();

		int mar = c.getCustomerMarks("Priya");
		System.out.println(mar);

		if (mar >= 0) {
			System.out.println("Print the marks card");
		}

	}

}
