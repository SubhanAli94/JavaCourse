public class MathOperations {
    public static void mathOperatorsExample() {
        // Arithmetic Operators
        int sum = 10 + 5;
        System.out.println("Addition: " + sum);

        int difference = 10 - 3;
        System.out.println("Subtraction: " + difference);

        int product = 4 * 3;
        System.out.println("Multiplication: " + product);

        int quotient = 20 / 4;
        System.out.println("Division: " + quotient);

        int remainder = 10 % 3;
        System.out.println("Modulus: " + remainder);

        // Relational Operators
        boolean isEqual = 10 == 10;
        System.out.println("Equal to (==): " + isEqual);

        boolean isNotEqual = 10 != 5;
        System.out.println("Not equal to (!=): " + isNotEqual);

        boolean isGreaterThan = 10 > 5;
        System.out.println("Greater than (>): " + isGreaterThan);

        boolean isLessThan = 10 < 5;
        System.out.println("Less than (<): " + isLessThan);

        boolean isGreaterOrEqual = 10 >= 10;
        System.out.println("Greater than or equal to (>=): " + isGreaterOrEqual);

        boolean isLessOrEqual = 10 <= 5;
        System.out.println("Less than or equal to (<=): " + isLessOrEqual);

        // Logical Operators
        boolean andResult = (10 > 5) && (5 < 10);
        System.out.println("AND (&&): " + andResult);

        boolean orResult = (10 > 5) || (5 > 10);
        System.out.println("OR (||): " + orResult);

        boolean notResult = !(10 > 5);
        System.out.println("NOT (!): " + notResult);
    }
}
