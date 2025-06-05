package javapractices2025;

public class Employee_ClassUnderstanding {
	// Class is the template
	//Object is physical entity
	 
	//These are called Instant variable/Class variable//global variable //template variable 
	//scope of the these variable is any where in the class
	String name;
	int age;
	double salary;
	char gender;

	public static void main(String[] args) {
		
		//int i=20;//its local variable 
		
		//Step1: We need to create the object for those variable using New Key world 
		
		/*
		 * new Employee_ClassUnderstanding();// object/instance of the class/
		 * Employee_ClassUnderstanding// is the class name new // is the key word used
		 * to create the object name and object of the class obj// is the reference
		 * variable of the new object
		 */
		
		Employee_ClassUnderstanding obj=new Employee_ClassUnderstanding();
		//Here we will get the default values of the datatype
		System.out.println(obj.name);//null
		System.out.println(obj.age);//0
		System.out.println(obj.gender);//space
		System.out.println(obj.salary);//0.0
		
		System.out.println("=======================");
		
		obj.name="Priya";
		obj.age=25;
		obj.gender='F';
		obj.salary=4000000.00;
	
		
		System.out.println(obj.name +"==>" +obj.age + "==>" + obj.gender + "==>" + obj.salary);
		
		
		//how to craete new object now ? 
		// by creating object of the class 
		
		
		Employee_ClassUnderstanding e=new Employee_ClassUnderstanding();
		e.name="Aadhya";
		
		e.age=5;
		e.gender='F';
		System.out.println(e.name + " ==>" + e.age + " ==>" +e.gender + " ==>" + e.salary);
		
	// now i will assign the salary value
		
		e.salary=900000000000000.00;
		
		System.out.println(e.name + " ==>" + e.age + " ==>" +e.gender + " ==>" + e.salary);
		
		
		
		

	}

}
