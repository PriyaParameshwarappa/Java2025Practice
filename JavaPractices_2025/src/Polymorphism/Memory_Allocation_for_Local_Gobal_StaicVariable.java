package Polymorphism;
// For explination refere notes 
public class Memory_Allocation_for_Local_Gobal_StaicVariable {
	int age;
	String name;

	public void m1() {
		int i = 20;
		System.out.println("m1");

	}

	public void m2() {
		int j = 30;
		System.out.println("m2");

	}

	public void m3() {
		int z = 67;
		System.out.println("m3");

	}

	public static void main(String[] args) {
		Memory_Allocation_for_Local_Gobal_StaicVariable s=new Memory_Allocation_for_Local_Gobal_StaicVariable();
		s.m1();
		s.m2();
		s.m3();
		

	}

}
