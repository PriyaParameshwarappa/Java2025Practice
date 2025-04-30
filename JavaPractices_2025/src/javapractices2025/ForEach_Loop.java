package javapractices2025;

public class ForEach_Loop {

	public static void main(String[] args) {
		int i[]=new int[4];
		i[0]=10;
		i[1]=30;
		i[2]=27;
		i[3]=98;
		for(int e:i) {
			System.out.println(e);
		}		
		
		System.out.println("=====================");
		
		double d[]=new double[3];
		d[0]=10;
		d[1]=30;
		d[2]=27;
		for(double e :d) {
			System.out.println(e);
		}
		
		System.out.println("========================");
		
		char ch[]=new char[3];
		ch[0]='a';
		ch[1]='A';
		ch[2]='&';
		
		for(char e:ch) {
			System.out.println(e);
		}
		
		
		//Print ASCII value using for each 
		System.out.println("===================");
		for(char e:ch) {
			System.out.println((byte)e);
		}
		
		
		//String array 
		System.out.println("=====================");
		
		String empname[]=new String[3];
		empname[0]="Priya";
		empname[1]="Aadhya";
		empname[2]="Deepak";
		
		for(String e:empname) {
			System.out.println(e);
		}
		
		
		

	}

}
