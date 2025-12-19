package javapractices2025;

public class Method_OverloadingUseCase {

	// Use case will be 1. Payment 2. Login 3. Search 4.Uber application
//=====================For Payment===========================
	public void payment(String netbanking, int otp, int profilecode) {

	}

	public void payment(String cc, int cvv) {

	}

	public void payment(int otp, String cc, int cvv) {

	}

	// =========================For Login=========================

	public void login(int phno, int otp) {

	}

	public void login(String email, int otp) {

	}

	public void login(String Fname, String bydefaultgoogleoptions) {

	}

	// ===============================Search ============================

	public void search(String brand, int price) {

	}

	public void search(int price, String colur) {

	}

	public void search(int price, String colur, String brand) {

	}

	// ==========================Uber Booking =================
	public void booking(String spint, String epoint) {

	}

	public void booking(String cartype, String spint, String epoint) {

	}

	public void booking(String cartype, String spint, String epoint, int price) {

	}
	// ===========

	public double caltax(int totalIncome, int bonus, int stocksprofits) {
		double totaltax = (totalIncome * 30) / 100 + bonus + stocksprofits;
		return totaltax;
	}
	
	public double caltax(int totalIncome, int bonus) {
		double totaltax = (totalIncome * 30) / 100 + bonus ;
		return totaltax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
