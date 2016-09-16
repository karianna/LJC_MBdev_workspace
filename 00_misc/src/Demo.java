
public class Demo {
	
	public static void main(String[] args) {
		
		House h= new House();
		System.out.println( "House h = "+ h );
		
		int age= 21;
		double height= 5 + 7/12.;
		height-= 1;
		
		System.out.println(height);
		if ( age == 21  &&  height < 4.1 || height > 4.9 ) {
			System.out.println( "Special" );
		}
	}
	
}
