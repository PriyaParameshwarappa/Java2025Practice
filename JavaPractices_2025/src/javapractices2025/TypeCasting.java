package javapractices2025;

public class TypeCasting {

	public static void main(String[] args) {
		// Coverting any datatype into one more datatype is call TypeCasting
		// Widening -> Converting smaller to bigger
		// Narrowing ->converting bigger to smaller

		//Widening 
		byte b=122;		
		short s=b;
		System.out.println(s);
		
		// Narrowing 
		
		short s1=200;
		byte b1=(byte) s1;
		System.out.println(b1);
		
		int i=18;
		long l=i;
		float f=i;
		double d=i;
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		byte b2=(byte) i;
		System.out.println(b2);
		
		System.out.println("================");		
		
		float f1=43.33f;
		int i1=(int)f1;
		System.out.println(i1);
		
		double d1=100.8;
		int i2=(int)d1;
		System.out.println(i2);
		
		char c='a';
		int i3=c;
		System.out.println(c);
		
		long l1=78622;
		char c3=(char)l1;
		System.out.println(c3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
