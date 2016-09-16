package stringequality;

public class Demo {

	public static void main(String[] args) {
		String s1= "Hello";
		String s2= "Hello";
		if (s1 == s2) 
			System.out.printf("%s == %s %n", s1, s2);

		String s3= s1.toUpperCase();
		String s4= s2.toUpperCase();
		if (s3 == s4)
			System.out.printf("%s == %s %n", s3, s4);
		else
			System.out.printf("%s IS NOT == %s %n", s3, s4);

		System.out.printf("%s .equals %s is:  %b %n", s1, s2,  s1.equals(s2) );	// Better!
		System.out.printf("%s .equals %s is:  %b %n", s3, s4,  s3.equals(s4) );

	}
}
