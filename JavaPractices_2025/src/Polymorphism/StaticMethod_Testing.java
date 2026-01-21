package Polymorphism;

public class StaticMethod_Testing {
	
	//difference between sttaic and nonstatic method 
	
	public static void getMail() {
		System.out.println("Get Email");
		
	}
	
	public void sendMail() {
		System.out.println("Send Email");
	}

	public static void main(String[] args) {
	//calling the static method 2 types within the class we can directly used it 
	// With other class we can call from the Class.name
	getMail();	
	StaticMethod_Testing.getMail();
	
	
	System.out.println("==============================================");
	
	//by creating the object of the class we can access the static method 
	
	StaticMethod_Testing st=new StaticMethod_Testing();
	st.sendMail();
	
	
	
	

	}

}
