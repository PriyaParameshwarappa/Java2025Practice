package encapsulations;

public class Employee_PrivateDataMemberCalling {

	public static void main(String[] args) {

		Employee e = new Employee("Aadhy", 8, 85000000, true);
		/*
		 * e.setName("Priya"); e.setAge(20); e.setSalary(50000000); e.setPrem(true);
		 */
		System.out.println(e.getName() + ": " + e.getAge() + " :" + e.getSalary() + " : " + e.isPrem());
		//tomorrow Aadhya age need to change then we can raither then calling the construtor, we can just use Set method 
		e.setAge(10);
		System.out.println(e.getName() + ": " + e.getAge() + " :" + e.getSalary() + " : " + e.isPrem());//now age is updated

	}

}
