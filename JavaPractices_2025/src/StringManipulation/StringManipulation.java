package StringManipulation;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {

		String s = "I love Java and i am happy to be Java developer";
		// find the length of String
		System.out.println(s.length());

		// find the index of the char array [String act as the collection of char array]
		// Lowest index will be 0 and higest index will be
		System.out.println((s.length()) - (1));

		// Find the char available on sing based on the index

		System.out.println(s.charAt(5));
		System.out.println(s.charAt(30));

		// Find the index based on the char available

		System.out.println(s.indexOf(2));
		System.out.println(s.indexOf('i'));
		System.out.println(s.indexOf('e'));

		// =====================================================

		// How to find the index of second 'i' in the String
		String str = "i am java developer and i love java and i happy to be java devloper am devi";
		System.out.println("Length od String " + str.length());
		System.out.println("Higest index" + (str.length() - 1));

		System.out.println("===========1st=====");

		System.out.println(str.indexOf('i'));

		// find the 2nd occurrence of i
		// we need to use indexOf method(char,where we need to start the counting the
		// char)

		System.out.println(str.indexOf('i', 1));

		// the above one we are hard coded with 1 , we need to write genric formula for
		// that

		System.out.println(str.indexOf('i', str.indexOf('i') + 1));

		// to find 3rd occurrence of i
		System.out.println("===================");
		int p2 = str.indexOf('i', str.indexOf('i') + 1);
		System.out.println(p2);
		// It will display second occurence

		System.out.println("===========3rd=====");

		System.out.println(str.indexOf('i', p2 + 1) + 1);

		int p3 = str.indexOf('i', (p2 + 1) + 1);

		System.out.println("===========4th=====");

		System.out.println(str.indexOf('i', (p3 + 1) + 1));

		System.out.println("===Finding the Index of String 'Java'===");
		String s1 = "I love Java";

		System.out.println(s1.indexOf("Java"));
		System.out.println("====If we try to give the String which is not present then Java will return -1==");
		System.out.println(str.indexOf("python"));

		System.out.println("=================================================================================");
		// In selenium, if we want to validate the message like "Welcome to Admin user"
		String s2 = "WelCome Admin";

		if (s2.indexOf("Admin") >= 8) {
			System.out.println("Test Case pass");
		} else {
			System.out.println("Testcase fail");
		}

		// Finding the String in paragraph

		String p = "By creating an account you will be able to shop faster, be up to date on an order's status,"
				+ "+ and keep track of the orders you have previously made.";

		if (p.indexOf("shop faster") >= 0) {
			System.out.println("Text present");
		}

		System.out.println("===============to remove the space from corners =============");

		String h = "   Hello world   ";
		System.out.println(h.trim());

		System.out.println("===============To Conver to Lower and Upper Letters =============");

		String u = "Hello Priya,how are you ";
		System.out.println(h.toUpperCase());
		System.out.println(h.trim().toLowerCase());

		System.out.println("===============By using replace method=============");

		System.out.println("How to replace the char");
		String dob = "06-01-1990";
		System.out.println(dob.replace("-", "/"));

		System.out.println("===============To remove space from middle of the word=============");

		String f = "Hello Aadhya, hope you are doing fine";
		System.out.println(f.replace(" ", ""));

		System.out.println("==============How to validate the specfic word from the paragraph==============");

		String k = "Hello Priya, Congratulation you have been selected for Google company with the pacakge of 80lakhs per annum";
		System.out.println(k.contains("80lakhs "));
		if (k.contains("selected")) {
			System.out.println("Priya is winner in life");
		} else {
			System.out.println("Better luck next time Priya");
		}

		System.out.println("==============Compair two String[equals]==============");

		String a = "Hello Selenium";
		String b = "Hello Selenium";

		if (a.equals(b)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		System.out.println("==============Compair two String[equalsIgnoreCase and trim]==============");

		String a1 = "hello Selenium";
		String b1 = " Hello Selenium";

		if (a1.equalsIgnoreCase(b1.trim())) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		System.out.println("==================================Split method scenior 1=========");

		String sp1 = "JAVA_PYTHON_JAVASCRIPT_C++";
		String sv[] = sp1.split("_");
		System.out.println(sv[0]);
		System.out.println(sv.length);
		System.out.println(Arrays.toString(sv));

		System.out.println("================Interview question to find the index[0]==============");

		String sp2 = "xXSeleniumXxXJavaxXAPItestingXxXGoogle";

		String sv1[] = sp2.split("xX");
		System.out.println(sv1[0]);
		System.out.println(sv1.length);
		System.out.println(Arrays.toString(sv1));

		System.out.println("Priya;Java;Selenium".split(";")[1]);

		// How to featch the OTP from given String

		String g = "The OTP of given transtion is 4569 ";

		String g1[] = g.split(" ");
		System.out.println(g1[g1.length-1]);	
		
		
		
		
		

	}

}
