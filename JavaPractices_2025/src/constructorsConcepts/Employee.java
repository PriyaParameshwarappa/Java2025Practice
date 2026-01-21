package constructorsConcepts;

public class Employee {
	String name;
	int age;
	double salary;
	String dob;
	boolean isPem;
	
	
	public Employee() {
		System.out.println("I am default constructor");
	}
	
	

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}



	public Employee(String name, int age, double salary, String dob, boolean isPem) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dob = dob;
		this.isPem = isPem;
	}
	



	public static void main(String[] args) {
		
		Employee s=new Employee("name",35,65000000,"06/01/1990",true);
		System.out.println(s.name + " " + s.age + " " +s.salary + " " +s.dob + " "+ s.isPem);
		//if i want to update priya salary to 80lakhs 
		s.salary=80000000;
		System.out.println(s.salary);
		
		
		

	}

}
