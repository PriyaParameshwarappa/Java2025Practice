package javapractices2025;

public class StaticConcept_Car {

	String name;
	int price;
	String model;
	static int wheels = 4;

	public static void main(String[] args) {
		StaticConcept_Car c = new StaticConcept_Car();
		c.name = "BMW";
		c.price = 55;
		c.model = "x2";

		StaticConcept_Car c1 = new StaticConcept_Car();
		c1.name = "Audi";
		c1.price = 45;
		c1.model = "o2";

		StaticConcept_Car c2 = new StaticConcept_Car();
		c2.name = "ford";
		c2.price = 11;
		c2.model = "aspire";

		// Accessing the static variable
		// two ways
		// 1 classname.variable

		System.out.println(StaticConcept_Car.wheels);

		// 2. Directly
		System.out.println(wheels);

		// Accessing non-static variable

		System.out.println(c.name + c.price + c.model);

		System.out.println(c1.name + c1.price + c1.model);

		System.out.println(c2.name + c2.price + c2.model);

		// How to access both static and nonstatic

		System.out.println(c.name + c.price + c.model + StaticConcept_Car.wheels);

		System.out.println(c1.name + c1.price + c1.model + StaticConcept_Car.wheels);

		System.out.println(c2.name + c2.price + c2.model +StaticConcept_Car.wheels);

	}

}
