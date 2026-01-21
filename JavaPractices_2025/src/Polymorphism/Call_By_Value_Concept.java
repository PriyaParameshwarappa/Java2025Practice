package Polymorphism;

public class Call_By_Value_Concept {

	public void sum(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Call_By_Value_Concept s=new Call_By_Value_Concept();
		s.sum(20, 80);
		

	}

}
