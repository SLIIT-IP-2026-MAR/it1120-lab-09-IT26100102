import java.util.Scanner;

public class IT26100102Lab9Q4 {
    
    // Method to calculate final mark (30% assignment, 70% exam)
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.3) + (examMark * 0.7);
    }
    
    // Method to find grade based on final mark
    public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }
    
    // Method to print student details
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-10s %-10.2f %-5c\n", name, finalMark, grade);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Arrays to store student data
        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];
        
        // Input data for 5 students
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = scanner.next();
            
            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignmentMark = scanner.nextDouble();
            
            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double examMark = scanner.nextDouble();
            
            // Calculate final mark and grade
            finalMarks[i] = calcFinalMark(assignmentMark, examMark);
            grades[i] = findGrades(finalMarks[i]);
        }
        
        // Print header
        System.out.println("\nName       Final Mark Grade");
        System.out.println("---------------------------");
        
        // Print details for all students
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }
        
        scanner.close();
    }
}