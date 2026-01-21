package constructorsConcepts;

public class Car_Registration {
	// How the car registraion or user registration using constructors

	String name;
	String colour;
	double price;
	String model;
	String chasisnumber;

	public Car_Registration(String name, String colour, double price, String model, String chasisnumber) {

		this.name = name;
		this.colour = colour;
		this.price = price;
		this.model = model;
		this.chasisnumber = chasisnumber;
	}

	public Car_Registration(String name, String colour, double price, String model) {

		this.name = name;
		this.colour = colour;
		this.price = price;
		this.model = model;
	}

	public Car_Registration(String name, String colour) {

		this.name = name;
		this.colour = colour;
	}

	public Car_Registration(String name, double price, String model, String chasisnumber) {

		this.name = name;
		this.price = price;
		this.model = model;
		this.chasisnumber = chasisnumber;
	}

	public static void main(String[] args) {
		
		Car_Registration r=new Car_Registration("BMW", "black");
		System.out.println(r.name + " " + r.colour);
		
		Car_Registration r1=new Car_Registration("BMW",9000000, "BMW123", "BMW123GFR");
		System.out.println("Car name : " + r1.name + "price: " + r1.price + " model: " + r1.model + " chasisnumber : " + r1.chasisnumber);
		
		
		
		

	}

}
