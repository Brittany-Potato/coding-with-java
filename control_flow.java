// Contro flow (logic)

public class control_flow {
    public static void main(String[] args) {
        // Set up a test variable
        int score = 85;
        
        // If/Else statements
        // The computer checks conditions from top to bottom
        // It will stop checking the rest once it finds a true one

        if (score >= 90) {
            System.out.println("Grade: A (Excellent!)");
        }
        else if (score >= 80) {
            System.out.println("Grade: B (Good job!)");
        }
        else if (score >= 70) {
            System.out.println("Grade: C (You passed!)");
        }
        else {
            // This runs if none of the above are true
            System.out.println("Grade: F (Study more.)");
        }

        // Logical operators

        // && (AND): Both sides must be true
        // || (OR): Only one side needs to be true
        // ! (Not): Flips true to false

        boolean hasTicket = true;
        boolean hasId = false;

        if (hasTicket && hasId) {
            System.out.println("Welcome to the club");
        } else {
            System.out.println("You cannot enter");
        }

        // The switch statement
        // Use this when checking ONE variable against specific values. 
        // It is cleaner than writing 10 "else if" statements.

        int dayNumber = 3;
        String dayName;

        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break; // 'break' stops the code from falling into the next case!
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            default:
                dayName = "Weekend"; // Runs if no cases match
        }
        System.out.println("Today is: " + dayName);
    }}
