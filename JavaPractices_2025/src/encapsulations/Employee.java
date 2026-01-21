package encapsulations;

public class Employee {

	private String name;
	private int age;
	private double salary;
	private boolean isPrem;

	// Has data members are private in nature, it cnt be access outside the call
	// To access outside the class we should use getter and setter method

	// Rule is : First we need to Set value using public keyword and we should get
	// value using public keyword

	// using the constructor we can setvalue for all one short public

	Employee(String name, int age, double salary, boolean isPrem) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isPrem = isPrem;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean isPrem() {
		return isPrem;
	}

	public void setPrem(boolean isPrem) {
		this.isPrem = isPrem;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
