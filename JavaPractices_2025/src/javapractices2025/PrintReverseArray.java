package javapractices2025;

public class PrintReverseArray {

	public static void main(String[] args) {
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		  for(int k=i.length-1;k>=0;k--) { 
			  System.out.println(i[k]); 
			  }
		 

		int count = i.length - 1;
		for (int e : i) {
			e = count;
			System.out.println(i[e]);
			count--;
		}

	}

}
