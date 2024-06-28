package marks;
import java.util.Scanner;



    public class StudentPassFail {
        public static void main(String[] args) {
            // Create a Scanner object to read input
            Scanner scanner = new Scanner(System.in);

            // Input the student's marks
            System.out.print("Enter the student's marks: ");
            double marks = scanner.nextDouble();

            // Define the pass mark
            double passMark = 50.0;

            // Check if the student has passed or failed
            if (marks >= passMark) {
                System.out.println("The student has passed.");
            } else {
                System.out.println("The student has failed.");
            }

            // Close the scanner
            scanner.close();
        }
    }


`