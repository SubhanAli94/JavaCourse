public class ControlStructures {
    public static void condtionalsExample() {
        // If-Else Example
        int age = 20;  // TODO: Change the age and test different conditions
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // Switch Example
        int day = 4;  // TODO: Change the day number and test different days
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number!");
        }
    }

    public static void loopsExample() {

        // =======================
        // 1. FOR LOOP
        // =======================
        System.out.println("=== FOR LOOP ===");

        // Print numbers from 1 to 5 using a for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        // TODO: Change the loop to print from 10 to 1 (reverse order)
        // TODO: Modify to print even numbers only (any_number % 2 == 0)
        // TODO: Print a multiplication table for 5 (number + " x " + i + " = " + (number * i))


        // =======================
        // 2. WHILE LOOP
        // =======================
        System.out.println("\n=== WHILE LOOP ===");

        int j = 1;
        // Print numbers from 1 to 5 using a while loop
        while (j <= 5) {
            System.out.println("Count is: " + j);
            j++; // Important: avoid infinite loop
        }

        // TODO: Modify to print numbers until a variable reaches 100
        // TODO: Use it to sum numbers from 1 to 50 (sum = sum + i)

        // =======================
        // 3. DO-WHILE LOOP
        // =======================
        System.out.println("\n=== DO-WHILE LOOP ===");

        int k = 1;
        // Print numbers from 1 to 5 using a do-while loop
        do {
            System.out.println("Value: " + k);
            k++;
        } while (k <= 5);

        // TODO: Change it to print numbers up to 10
        // TODO: Try setting k = 10 and condition k < 5 to see how do-while runs once
    }
}
