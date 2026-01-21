package Polymorphism;

public class Call_By_Reference_Concept {
	String name;
	int age;
	//Use case we will use in Page object module 

	// Using the call_By_Refernce calling non-static method in static method

	public void m1() {
		System.out.println("I am M1 method");
	}

	public static void t1(Call_By_Reference_Concept r1) {
		r1.m1();
		System.out.println(r1.name);
		System.out.println(r1.age);
		//Interview they will ask 2nd question  NOw if we change the value of name and age
		r1.name = "Aadhya";
		r1.age = 8;

	}

	public static void main(String[] args) {
		Call_By_Reference_Concept obj = new Call_By_Reference_Concept();
		// Interview will ask 1st ,question like,what is the value of name and age
		obj.name = "Priya";
		obj.age = 36;

		Call_By_Reference_Concept.t1(obj);
		System.out.println(obj.name);
		System.out.println(obj.age);

	}

};
