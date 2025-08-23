public class Operators {
	public static void main(String[] args) {
		int x = 1;
		double y = 1.5;
		
		// int + double = double
		System.out.println("1 + 1.5");
		System.out.println(x + y);
		
		int a = 5;
		int b = 2;
		
		// int / int = int (everything to the right of the decimal is truncated)
		System.out.println("5 / 2");
		System.out.println(a / b);
		
		double c = b; // Type casting
		System.out.println("Type casting example");
		System.out.println(c);
		
		// int * double = 
		System.out.println("5 * 2.0");
		System.out.println(a * c);
		
		// int / double = 
		System.out.println("2 / 2.0");
		System.out.println(b / c);
		
	}
}