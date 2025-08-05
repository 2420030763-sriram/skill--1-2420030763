// Junior Software Developer Task:
// Demonstrate all 8 primitive data types with real-world values in a tutorial app

public class junior {
    public static void main(String[] args) {

        // 1. byte - A person's age (small whole number, range: -128 to 127)
        byte age = 21;
        System.out.println("Person's Age (byte): " + age + " years");

        // 2. short - Current year (range: -32,768 to 32,767)
        short currentYear = 2025;
        System.out.println("Current Year (short): " + currentYear);

        // 3. int - Population of a country (large whole number)
        int population = 1410000000;  // Example: India
        System.out.println("Country Population (int): " + population);

        // 4. long - Distance from Earth to Moon in meters (very large number)
        long distanceToMoon = 384400000L;
        System.out.println("Distance to Moon (long): " + distanceToMoon + " meters");

        // 5. float - Approximate value of Pi (decimal, lower precision)
        float pi = 3.14f;
        System.out.println("Value of Pi (float): " + pi);

        // 6. double - Acceleration due to gravity (decimal, higher precision)
        double gravity = 9.80665;
        System.out.println("Gravity (double): " + gravity + " m/s²");

        // 7. char - A student's grade (single character)
        char grade = 'A';
        System.out.println("Student's Grade (char): " + grade);

        // 8. boolean - Whether Java is fun to learn (true/false)
        boolean isJavaFun = true;
        System.out.println("Is Java fun to learn? (boolean): " + isJavaFun);
    }
}
