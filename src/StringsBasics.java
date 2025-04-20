public class StringsBasics {
    public static void example() {
        // ========================
        // What is a String?
        // ========================
        // A String is a sequence of characters used to store and work with text.
        // It is NOT a primitive type. It's a reference type (class) in Java.

        // ========================
        // Creating Strings
        // ========================

        // Using string literal (preferred, stored in string pool)
        String name = "Alice";

        // Using the new keyword (creates new object in memory)
        String city = new String("Dubai");

        // ========================
        // Printing Strings
        // ========================
        System.out.println("Name: " + name);        // Output: Name: Alice
        System.out.println("City: " + city);        // Output: City: Dubai

        // ========================
        // String Methods
        // ========================

        String sentence = "Java programming is fun";

        System.out.println("Length: " + sentence.length());          // Get length
        System.out.println("Uppercase: " + sentence.toUpperCase());  // Convert to uppercase
        System.out.println("First character: " + sentence.charAt(0)); // Get character at index
        System.out.println("Contains 'fun'? " + sentence.contains("fun")); // Check if contains a word
        System.out.println("Substring (5–16): " + sentence.substring(5, 16)); // Get a substring

        // ========================
        // Comparing Strings
        // ========================
        String a = "hello";
        String b = "hello";
        String c = new String("hello");

        System.out.println("a == b: " + (a == b));         // true (same reference from string pool)
        System.out.println("a == c: " + (a == c));         // false (different memory)
        System.out.println("a.equals(c): " + a.equals(c)); // true (content is same)

        // ========================
        // TODOs
        // ========================
        // TODO 1: Create a string with your full name and print it
        // TODO 2: Count the number of characters in your name
        // TODO 3: Convert your name to uppercase
        // TODO 4: Extract and print the first 3 letters of your name
        // TODO 5: Check if your name contains the letter "a"
    }
}
