// For Loops - When you know exactly how many times to run
// While Loops - Run UNTIL a condition changes
// Do-While Loops - Run atleast once, then check

public class loops {
    public static void main(String[] args) {
        //  The FOR Loop

        // Syntax: for (start' stop' step)
        // 1. Start : int i = 1 (Create a counter)
        // 2. Stop: 1 <= 5 (Keep going as long as i is 5 or less)
        // 3. Step: i++ (Add 1 to i after every round)

        System.out.println("Counting to 5");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Count is: " + i);
        }

        // The WHILE Loop

        System.out.println("While loop");

        int fuel = 3;

        while (fuel > 0) {
            System.out.println("Driving .. Fuel left: " + fuel);
            fuel--; // Decrease fuel by 1 (Very important or loop runs forever!)
        }
        System.out.println("Out of gas!");

        // The DO-WHILE loop
        // Shoot first, ask questions later
        // It ALWAYS runs the code at least once, even if the condition is false

        System.out.println("Do-While loop");

        int number = 10;

        do { 
            System.err.println("This prints even though 10 is not less than 5");
        } while (number < 5);
        
        // Break
        // How to stop a loop early

        System.out.println("Loop with break");

        for (int i = 0; i < 100; i++) {
            if (i == 4) {
                System.out.println("Found number 4!");
                break; // Kills the loop
            }
            System.out.println("Checking number: " + i);
        }
    }}
