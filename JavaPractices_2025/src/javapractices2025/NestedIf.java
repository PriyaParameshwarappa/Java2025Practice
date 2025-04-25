package javapractices2025;

public class NestedIf {

	public static void main(String[] args) {
		int marks =100;

		if (marks <= 100) {

			if (marks >= 90) {
				System.out.println("A GRADE");
				if (marks >= 98) {
					System.out.println("You will get Scholarship");
					if (marks == 100) {
						System.out.println("0% Tution Fee ");

					} else {
						System.out.println("10% tution fee");
					}
				}
			}
		}

		else {
			System.out.println("===INVALID MARKS========");

		}

	}
}
