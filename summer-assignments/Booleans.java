import java.awt.*;
import java.util.*;

public class Booleans {
    public static void main(String[] args) {
		// Can't create references
		// if I can't create objects
		
		// References are ==
		// Two separate objects with the same value are !=
		
		// Can't use relational operators on Strings
		
        // Get a random number from 1 to 8
        int randint = (int)(Math.random() * 9);

        // Use if statements to test the random number
        // and print out 1 of 8 random responses
        if (randint == 1) {
            System.out.println("wsg gang");
        }
        if (randint == 2) {
            System.out.println("wsggg ganggg");
        }
        if (randint == 3) {
            System.out.println("why hello fine sir");
        }
        if (randint == 4) {
            System.out.println("this lowk getting tiring");
        }
        if (randint == 5) {
            System.out.println("zzzzzz");
        }
        if (randint == 6) {
            System.out.println("bro this could be done with indeces on lists");
        }
        if (randint == 7) {
            System.out.println("hate thos goddamn semicolons");
        }
        if (randint == 8) {
            System.out.println("finally it's over");
        }
    }
}