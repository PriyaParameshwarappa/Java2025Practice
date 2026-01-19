package ex_01_Java_Basics;

public class Operator_Logical {

	public static void main(String[] args) {
		boolean a = true;
		System.out.println(a);
		System.out.println(!a);
		System.out.println(!!a);

		boolean b = true || false;
		System.out.println(b);

		boolean c = false && true;
		System.out.println(c);

		// When its String the operators act like '+'concatnation
		String s = "Welcome ";
		String t = "Priya ";
		System.out.println(s + t);
		// + behavie like addition while number but when it STing it act like
		// concatnation

		// Interview question

		String a1 = "Priya";
		String b1 = "Welcome";

		int o = 10;
		int o1 = 20;

		System.out.println(a1 + b1 + o + o1);

		System.out.println(o + o1 + a1 + b1);

		System.out.println(a1 + b1 + (o + o1));

		System.out.println((9 * 3 / 9 + 1) * 3);

		System.out.println(10 == 10);
		System.out.println(10 == 11);
		
		System.out.println(!(12>50));
		
	
		System.out.println(true||true);

	}

}
