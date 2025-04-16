package javapractices2025;

public class StringDataType_StringConcetenation {

	public static void main(String[] args) {

		// String is non-primtive datatype

		String x = "Java Automation";
		String y = "123"; // here the number will be string

		int a = 100;
		int b = 200;

		System.out.println(x + y);
		System.out.println(a + b);
		System.out.println(x + y + a + b);
		System.out.println(a + b + x + y);
		System.out.println(x + y + (a + b));

		double d = 12.33;
		double e = 12.45;
		System.out.println(x + y + (a + b + d + e));
		System.out.println(x + y + a + b + d + e);
		System.out.println(x + y + (a + b + d + e));

		System.out.println("Sum of two number = " + a + b);// 100200
		System.out.println("Sum of two numbers =" + (a + b));// 300

		char ch = 'a';
		System.out.println(ch);
		char ch1 = 'b';
		System.out.println(ch1);
		String st = "CharwithString";
		System.out.println(ch + st);

		// When we do any arthametical operation then it will print ASCII value

		System.out.println(ch + ch1);// Here ASCII value will be added when we do adding two charature

		// Finding the ASCII value of the number
		// First way
		System.out.println("========");
		char c1 = 'a';
		System.out.println((byte) c1);//97
		System.out.println((byte) '$');	//36	
		System.out.println((byte)'#');//35
		
		System.out.println('a'+10+20); //127
		System.out.println('a'+10+20-10); //117
		
		//Second value is just add zero 
		System.out.println("===Finding ASCII value in second value=====");
		
		System.out.println('a'+0);
		System.out.println('$'+0);
		
		System.out.println("==When we add ASCII value with String and char");
		
		System.out.println("The adding String with Char==="+'a');// here concatnination will happen 
		
		System.out.println('a'+'c'+'0'+'9'+'A'+"hello"+'a'+'b');
		// here 9 we writen in char '' hence ASCII va;ue of 9 willl be added  
		System.out.println((byte)'a'+(byte)'c'+(byte)'0'+(byte)'A'+'9'+"Hello"+'a'+'b');
		
		// here 9 is witout the '' just 9 will be added 
		System.out.println((byte)'a'+(byte)'c'+(byte)'0'+(byte)'A'+9+"Hello"+'a'+'b');
		
		
		
		
		

	}

}
