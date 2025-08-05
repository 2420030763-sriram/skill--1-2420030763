// Student Dashboard Module - Basic Version
// Displays student details in a formatted summary slip

public class rollnumbers {
    public static void main(String[] args) {

        // Declaring and initializing student details
        long rollNumber = 20250101L;
        String name = "Srirama Chinatalapudi";
        float marks = 87.5f;
        char gender = 'M';
        boolean isPassed = true;

        // Printing the Student Summary Slip
        System.out.println("======================================");
        System.out.println("         STUDENT SUMMARY SLIP         ");
        System.out.println("======================================");
        System.out.println("Roll Number     : " + rollNumber);
        System.out.println("Name            : " + name);
        System.out.println("Marks           : " + marks + " / 100");
        System.out.println("Gender          : " + gender);
        System.out.println("Pass/Fail Status: " + (isPassed ? "Pass" : "Fail"));
        System.out.println("======================================");
    }
}
