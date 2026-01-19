package ex_01_Java_Basics;

public class Operator {

	public static void main(String[] args) {
		
		// relational operator [<,>,>=,<=,==,!=]
		
		int a=100;
		int b=20;
		boolean c= a > b;
		System.out.println(c);
		
		int age_priya=35;
		int age_deepak=40;
		if(age_priya>=age_deepak) {
			System.out.println("Priya is bigger in age");
		}else {
			System.out.println("Deepak is bigger in age");
		}
		
		if(age_priya!=age_deepak) {
			System.out.println("Priya can move abroad");
		}else {
			System.out.println("Deepak can move abroad");
		}
		
		
		
		int x=20;
		int y=30;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		//logical operator 
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		
		//compound Assignmnt operator 
		int age=10;
		age+=10;//age=age+10;
		age*=10;//age=age*10;
		age-=10;//age=age-10;
		age/=10;//age=age/10;
		System.out.println(age);
		
		//Bitwise operator 
		//[~,>>,<<,^]
		
		
		//new operator 
		
		// new opertore will create the memory in JVM 
		
		String a1=new String();
		a1="Priya";
		
		//Instant of Operator 
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
