public class syntax_and_variables {
    // The main method
    // Java does not know where to start unless you tell it
    // "public static void main" is the universal start button
    public static void main(String[] args) {
        // Syntax rules

        // Rule A: Statements MUST end with a semicolon;
        System.out.println("Java requires semicolons");

        // Rule B: Blocks of code are wrapped in curly braces { }
        // You can see them wrapping the class in this method

        // Rule C: Case sensitivity
        // 'system' is wrong. 'System' is right.

        //* Variables (Primitives)
        // Java is 'strongly typed'. you must define the type.
        // Formula: Type name = value;

        // 1. int (Integer): Whole numbers 
        int myAge = 25;

        // double: Decimal numbers (The standard for math/money)
        double price = 19.99;

        // boolean: True or False (lowercase)
        boolean isJavaFun = true;

        // char: Single character (MUST use Single Quotes ' ')
        char grade = 'A';

        //* Variables (Non-primitive)
        // string: Test (MUST use double quotes " ")
        // Capital 'S' because it's a class, not a primitive
        String greeting = "Hello developer";

        //* Declaration VS initialization

        int x; // Declaration (Creating the box)
        x = 100; // Initilization (Putting data in the box)
        int y = 200; // Doing both at once

        //* Output
        // Using '+' to combine (Concatenate) variables with text
        System.out.println(greeting);
        System.out.println("My grade is: " + grade);
        System.out.println("The total is: " + (x + y)); 
    }}
