public class Arrays {
	
    static void readArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    } // Method overloading
    static void readArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
	
	public static void main(String[] args) {
		// When you create an array in java
		// the array can only have values of a specific class
		// and the array can only have a fixed length

		int[] array = new int[5]; // This is an array of 5 zeros
		System.out.println("Array of 5 zeros");
		readArray(array);
		
		String[] string_array = new String[5];
		System.out.println("String array of length 5");
		readArray(string_array);
		
		String[] set_array = {"This", "was", "the", "entire", "array"};
		System.out.println("Preset array");
		readArray(set_array);
		System.out.println("Changing element of index 1 to 'is'");
		set_array[1] = "is";
		readArray(set_array);
		
		// Initializations for each array type:
		// int: 0
		// double: 0.0
		// boolean: false
		// reference (ex. String): null
	}
}