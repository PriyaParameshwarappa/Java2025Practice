package Polymorphism;

public class MainMethod_Overloading {

	public static void main(String[] args) {
		System.out.println("This is the main having proper signature");
		main("Priya");
		main(5000000, 1000000);

	}

	public static void main(String a) {
		System.out.println("My name is::" + a);

	}

	public static void main(int a, int b) { 
		System.out.println("my salary is"+ a +" lakhs per year and " + b +" lakhs per month ");

	}

}
