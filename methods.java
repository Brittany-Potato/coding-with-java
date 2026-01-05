public class methods {
    // Main method
    // This is the boss. It tells the other methods when to work
    public static void main(String[] args) {

        // 1. Calling a basic method
        sayHello();
        sayHello();

        // Calling a method with parameters (inputs)
        greetUser("Brittany");
        greetUser("Java Master");

        // Calling a method that returns a value
        int result = addNumbers(5, 10);
        System.out.println("The math result is: " + result);

        // Or print it directly
        System.err.println(addNumbers(100, 200));
    }

    // Custom methods
    // They must be inside the class but outside the main

    // The "Void" method
    // 'void' means it does the work but returns nothing
    public static void sayHello() {
        System.out.println("Hello from a method!");
    }

    // Method with parameters
    // We expect a string to be passed in, and we name it 'name'
    public static void greetUser(String name) {
        System.out.println("Welcome back" + name);
    }

    // The "return" method
    // instead of void we write int
    // This promises that this method will give back an integer 
    public static int addNumbers(int a, int b) {
        int total = a + b;
        return total; // The 'return' word sends the data back to main
    }
}