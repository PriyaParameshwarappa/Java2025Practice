package javapractices2025;

import java.util.Arrays;

public class ObjectArray {

	public static void main(String[] args) {
		
		//To store Different type of data in single arry like {name,age,salary,}
		//we use Object array 
		
		Object data[]=new Object[4];
		data[0]="Priya";
		data[1]=30;
		data[2]='m';
		data[3]=60.55;
		System.out.println(Arrays.toString(data));
		
		for(Object e:data) {
			System.out.println(e);
		}
		
		System.out.println("==============");
		for(int k=0;k<=data.length-1;k++) {
			System.out.println(data[k]);
		}

	}
	
	

}
