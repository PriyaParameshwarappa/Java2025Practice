package javapractices2025;

public class PrintEvenNumberfrom1to100 {

	public static void main(String[] args) {
	
		for(int k=1;k<=100;k++) {
			if(k % 2==0) {
				System.out.println(k + "= Even Number");
			}else if(k % 2!=0) {//(k%2==1)
				System.out.println(k + "= Odd Number");
			}
		}
		

	}

}
