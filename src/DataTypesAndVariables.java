public class DataTypesAndVariables {
    public static void example(){
        // byte: 8-bit integer (range: -128 to 127)
        byte myByte = 127;
        System.out.println("byte: " + myByte);

        // short: 16-bit integer (range: -32,768 to 32,767)
        short myShort = 32000;
        System.out.println("short: " + myShort);

        // int: 32-bit integer (whole numbers)
        int myInt = 100;
        System.out.println("int: " + myInt);

        // long: 64-bit integer (use 'L' suffix)
        long myLong = 123456789L;
        System.out.println("long: " + myLong);

        // float: 32-bit floating point number (use 'f' suffix)
        float myFloat = 9.81f;
        System.out.println("float: " + myFloat);

        // double: 64-bit floating point number (decimals)
        double myDouble = 3.14159;
        System.out.println("double: " + myDouble);

        // char: 16-bit single character (Unicode)
        char myChar = 'A';
        System.out.println("char: " + myChar);

        // boolean: true or false values (1-bit)
        boolean isJavaFun = true;
        System.out.println("boolean: " + isJavaFun);
    }
}
