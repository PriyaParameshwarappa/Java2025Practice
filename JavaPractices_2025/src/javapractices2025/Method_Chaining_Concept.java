package javapractices2025;

public class Method_Chaining_Concept {

	public void m1() {
		System.out.println("M1 method");
		// call non-static method m2 in m1
		m2();

	}

	public void m2() {
		System.out.println("M2 method");
		// call non-static method m3 in m2
		m3();

	}

	public void m3() {
		System.out.println("M3 method");
		// now call Static method in non-static method , it can be achieved by creating
		// object of the class
		Method_Chaining_Concept.t1();

	}

	public static void t1() {
		System.out.println("T1 method");
		t2();
	}

	public static void t2() {
		System.out.println("T2 method");
		t3();
	}

	public static void t3() {
		System.out.println("T3 method");
		Method_Chaining_Concept m = new Method_Chaining_Concept();
		m.m3();
		// here we have issue like created multiple object with the class, to over come in Java we have concept call call by reference
	}

	public static void main(String[] args) {

		Method_Chaining_Concept s = new Method_Chaining_Concept();
		s.m2();
		s.m3();
		t3();

	}

}
