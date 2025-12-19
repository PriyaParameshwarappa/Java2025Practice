package javapractices2025;

public class IQ_CanWEExchangeReferenceVariable {
	
	String name ;
	int age;
	String city;

	public static void main(String[] args) {
		IQ_CanWEExchangeReferenceVariable u=new IQ_CanWEExchangeReferenceVariable();
		u.name="Priya";
		u.age=35;
		u.city="Bangalore";
		
		IQ_CanWEExchangeReferenceVariable u1=new IQ_CanWEExchangeReferenceVariable();
		u1.name="Aadhya";
		u1.age=5;
		u1.city="Texas";
		
		IQ_CanWEExchangeReferenceVariable u2=new IQ_CanWEExchangeReferenceVariable();
		u2.name="Kushi";
		u2.age=07;
		u2.city="Chennai";
		
		System.out.println(u.name);
		System.out.println(u1.name);
		System.out.println(u2.name);
		
		//now change the reference variable 
		System.out.println("==================");
		u=u1;
		System.out.println(u.name);
		System.out.println(u1.name);
		System.out.println(u2.name);
				
		System.out.println("==================");
		u1=u2;
		System.out.println(u.name);
		System.out.println(u1.name);
		System.out.println(u2.name);

		System.out.println("==================");
		u2=u;
		System.out.println(u.name);
		System.out.println(u1.name);
		System.out.println(u2.name);
		
		
		
	}

}
