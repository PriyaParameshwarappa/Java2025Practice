package javapractices2025;

import java.util.Arrays;

public class ArrayConcepts {

	public static void main(String[] args) {
		
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[0]);
		
		//the length of the Array 
		int len=i.length;
		System.out.println("length is "+len);
		
		// Find the Higest Index 
		
		int hi=len-1;
		System.out.println(hi);
		
		
		int li=0;
		System.out.println(li);
		
		for(int k=0;k<=3;k++) {
			System.out.println(i[k]);
		}
		
		System.out.println("========================");
		System.out.println(len);
		for(int k=0;k<=i.length-1;k++) {
			System.out.println(i[k]);
			
		}
		
		
		System.out.println("==========Second way to printing without -1 ====== ");
		for(int k=0;k<i.length;k++) {
			System.out.println(i[k]);
			
		}
	
		
		System.out.println("===========Print Array's value without loops==================");
		System.out.println(Arrays.toString(i));
		
		
		System.out.println("===========================");
		int k[]=new int[3];
		k[4]=34;// We will get AIOB errror
		
		
		
		
		

	}

}
