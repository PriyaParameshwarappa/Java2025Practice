package javapractices2025;

public class IV_Q_ChangeOfObjectMethodReference {
	String name;
	int age;

	public static void main(String[] args) {
		
		IV_Q_ChangeOfObjectMethodReference o1=new IV_Q_ChangeOfObjectMethodReference();
		o1.name="Priya";
		o1.age=35;
		
		IV_Q_ChangeOfObjectMethodReference o2=new IV_Q_ChangeOfObjectMethodReference();
		o2.name="Suma";
		o2.age=35;
		
		IV_Q_ChangeOfObjectMethodReference o3=new IV_Q_ChangeOfObjectMethodReference();
		o3.name="Divya";
		o3.age=35;
		
		o1=o2;
		
		
		System.out.println(o1.name);
		System.out.println(o2.name);
		System.out.println(o3.name);
		
		
		
		
		
		
	}

}
