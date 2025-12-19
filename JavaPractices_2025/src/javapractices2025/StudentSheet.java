package javapractices2025;

public class StudentSheet {

	// WAF to get Student Marks by providng the student name
	// return is marks and marks should be 0 to 100

	public static int getStudentMarks(String name) {

		switch (name.toLowerCase().trim()) {
		case "priya":
			return 90;

		case "Ravi":
			return 35;
		case "Aadhya":
			return 100;

		default:
			System.out.println("Please Enter valid student name or Student you provided is not exist in DataBase");
			return -1;

		}
	}

	public static void main(String[] args) {
		int marks = getStudentMarks("Priya");
		System.out.println(marks);

	}

}
