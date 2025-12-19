package interviewpreparation;

public class SwapTwoNumbersWithoutUsingTemp {

	public static void main(String[] args) {
	
		int a=20;
		int b=30;
		System.out.println("A value is="+ a + "      B value is== "+ b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A value after swipe="+ a + "     B value after swipe== "+ b);
	}
}
