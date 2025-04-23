package javapractices2025;

public class IncementOperators {

	public static void main(String[] args) {
	//++-> Value should be incressed by 1 
	/* 2 Types 
	 * Pre Increment
	 *  Post Increment
	 */
	int a=1;
	System.out.println(a);
	int b=a++;
	System.out.println(a);
	System.out.println(b);
	
	int c=-98;
	int d=c++;
	System.out.println(c);
	System.out.println(d);
	
	//Post increment 
	
	int e=90;
	int f=++e;
	System.out.println(e);
	System.out.println(f);
	
		
	int r=-100;
	int k=++r;
	System.out.println(r);
	System.out.println(k);
		
		
	//complex 
	
	int y=11;
	int z=	y++ + ++y;
	System.out.println(z);
	
	
	//Example 2:: 
	
	int s=11;
	int t=22;
	int u;
	
	
	u=s+t+ s++ + t++ + ++s + ++t;
	
	
	System.out.println(s);//13
	System.out.println(t);//24
	System.out.println(u);//103
	
	
	int p=0;
	int p1= p++ - --p + ++p - p--;
	//1-(0)+1-1=1+1-1=1
	System.out.println(p1);
	
	
	System.out.println("====Applying on ch====");
	
	char ch='A';
	System.out.println(ch++);
	System.out.println(ch);
	
	char ch1='a';
	System.out.println(ch1++);
	System.out.println(ch1);
	
	
	double du=1.2;
	System.out.println(du++);
	System.out.println(++du);
	System.out.println(du);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		

	}

}
