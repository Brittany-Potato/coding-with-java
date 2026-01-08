// Arrays

public class lists {
    public static void main(String[] args) {
        // The QUICK way
        // This is for when you already know the values
        // Format: type[] name = { values };

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        // Accessing items:
        System.out.println("First car: " + cars[0]); // 0 index is the first one
        System.out.println("Second car: " + cars[1]);

        // Changing an item
        cars[0] = "Tesla";
        System.out.println("I have " + cars.length + " cars.");

        // The EMPTY way
        // This si for when you do not know the value yet
        // You MUST define the size (It cannot be changed after)

        int[] grades = new int[3]; //Creates empty slots: [0, 0, 0]
        
        grades[0] = 95;
        grades[1] = 80;
        grades[2] = 75;
        // Grades[3] = 100; ERROR Index 3 doesn't exist, onl (0,1,2)

        System.out.println("Grade 1: " + grades[0]);

        // Looping through arrays
        // How to print everything in the list
        System.out.println("\n---All cars list---");

        // The "For-Each" Loop (Easiest)
        // Read as: "For every string 'i' inside 'cars'"
        for(String i : cars) {
            System.out.println(i);
        }

        // The standard Loop (If you need the index number)
        System.out.println("\n Grades list");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Slot " + i + ": " + grades[i]);
        }
    }
}