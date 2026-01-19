package ex_01_Java_Basics;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
// in Ifcon Break and Continue will  not work 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		int age=sc.nextInt();
		System.out.println(age);
		if(age>=18) {
			System.out.println("Can go to Goa");
		}else {
			System.out.println("You cannot go for Goa");
		}
		
		
		
		

	}

}
