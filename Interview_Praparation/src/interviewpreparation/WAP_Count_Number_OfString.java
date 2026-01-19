package interviewpreparation;

public class WAP_Count_Number_OfString {

	public static void main(String[] args) {

		String s = "WelCome to Java world";
		int n = s.length();
		int count = 0;

		for (int i = 0; i <= n; i++) {
			count = i++;

		}

		System.out.println(count);
	}

}
