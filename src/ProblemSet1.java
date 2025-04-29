import java.util.ArrayList;

public class ProblemSet1 {

    // Problem 1: Reverse an Array
    // Given an array of integers, reverse it in-place and print the result.
    public void reverseArray() {
        int[] nums = {1, 2, 3, 4, 5}; // Sample input
        // TODO:
        // 1. Use two pointers (start and end) to swap elements from the beginning and end.
        // 2. Move the pointers inward until they meet.
        // 3. Print the reversed array.
    }

    // Problem 2: Sum of ArrayList Elements
    // Given an ArrayList of integers, compute and print the sum of all elements.
    public void sumArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4); // Sample input
        // TODO:
        // 1. Initialize a variable to store the sum.
        // 2. Iterate through the ArrayList using a loop.
        // 3. Add each element to the sum.
        // 4. Print the sum.
    }

    // Problem 3: Count Occurrences in Array
    // Given an array of integers and a target number, count and print how many times the target appears.
    public void countOccurrences() {
        int[] nums = {1, 2, 3, 2, 4, 2};
        int target = 2; // Sample input
        // TODO:
        // 1. Initialize a counter variable.
        // 2. Iterate through the array and increment the counter when the target is found.
        // 3. Print the counter.
    }

    // Problem 4: Remove Element from ArrayList
    // Given an ArrayList of integers and a value, remove all occurrences of that value and print the new size.
    public void removeElement() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(3);
        int val = 3; // Sample input
        // TODO:
        // 1. Iterate through the ArrayList using a loop.
        // 2. Remove the element if it matches the value (handle index carefully).
        // 3. Print the size of the modified ArrayList.
    }

    // Problem 5: Find First Positive Number
    // Given an array of integers, find and print the first positive number, or print -1 if none exists.
    public void firstPositive() {
        int[] nums = {0, -1, 3, 5, -2}; // Sample input
        // TODO:
        // 1. Iterate through the array.
        // 2. If an element is greater than 0, print it and stop.
        // 3. If no positive number is found, print -1.
    }

    // Problem 6: Count Vowels in a String
    // Given a string, count the number of vowels (a, e, i, o, u, case-insensitive) and print the count.
    public void countVowels() {
        String str = "Hello World"; // Sample input
        // TODO:
        // 1. Initialize a counter for vowels.
        // 2. Iterate through each character in the string.
        // 3. Convert the character to lowercase and check if it is a vowel (a, e, i, o, u).
        // 4. Increment the counter if it is a vowel.
        // 5. Print the vowel count.
    }

    // Problem 7: Reverse a String
    // Given a string, reverse it and print the result.
    public void reverseString() {
        String str = "Java"; // Sample input
        // TODO:
        // 1. Convert the string to a character array.
        // 2. Use two pointers (start and end) to swap characters from the beginning and end.
        // 3. Move the pointers inward until they meet.
        // 4. Convert the character array back to a string.
        // 5. Print the reversed string.
    }

    // Problem 8: Find First Non-Repeated Character
    // Given a string, find the first character that appears only once (case-insensitive) and print it, or print "No non-repeated character" if none exists.
    public void findFirstNonRepeatedChar() {
        String str = "success"; // Sample input
        // TODO:
        // 1. Create an ArrayList to store character counts or track characters.
        // 2. Iterate through the string to count occurrences of each character (convert to lowercase for case-insensitivity).
        // 3. Iterate through the string again to find the first character with a count of 1.
        // 4. Print the first non-repeated character, or "No non-repeated character" if none is found.
    }

    // Problem 9: Find Second Largest in Array
    // Given an array of integers, find and print the second largest number.
    public void findSecondLargest() {
        int[] nums = {5, 3, 8, 1, 4}; // Sample input
        // TODO:
        // 1. Initialize two variables to track the largest and second largest numbers.
        // 2. Iterate through the array.
        // 3. Update largest and second largest when a new number is larger than either.
        // 4. Print the second largest number.
    }

    // Problem 10: Move Zeros to End
    // Given an array of integers, move all zeros to the end while maintaining the order of non-zero elements and print the result.
    public void moveZeros() {
        int[] nums = {0, 1, 0, 3, 12}; // Sample input
        // TODO:
        // 1. Use a pointer to track the position for the next non-zero element.
        // 2. Move all non-zero elements to the front.
        // 3. Fill the remaining positions with zeros.
        // 4. Print the modified array.
    }
}
