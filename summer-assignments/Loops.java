public class Loops {
	public static void main(String[] args) {
		System.out.println("While loop");
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("For loop:");
		// Variable i is already defined, no need to write "int i"
		for (i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		System.out.println("Break loop early");
		for (i = 0; i < 5; i++) {
			System.out.println(i);
			if (i == 1) {
				System.out.println("Set i to 3, but i++ will run again on the next iteration");
				i = 3;
			}
		}
	}
}