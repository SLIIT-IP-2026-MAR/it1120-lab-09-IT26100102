import java.util.Scanner;

public class IT26100102Lab9Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter value a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter value b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter value c: ");
        double c = scanner.nextDouble();
        
        // Calculate discriminant (b^2 - 4ac)
        double discriminant = Math.pow(b, 2) - (4 * a * c);
        
        // Check if discriminant is positive, zero, or negative
        if (discriminant > 0) {
            // Two real and different roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and different:");
            System.out.printf("Root 1: %.2f\n", root1);
            System.out.printf("Root 2: %.2f\n", root2);
        } else if (discriminant == 0) {
            // One real root (repeated)
            double root = -b / (2 * a);
            System.out.println("Roots are real and same:");
            System.out.printf("Root: %.2f\n", root);
        } else {
            // Imaginary roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are imaginary:");
            System.out.printf("Root 1: %.2f + %.2fi\n", realPart, imaginaryPart);
            System.out.printf("Root 2: %.2f - %.2fi\n", realPart, imaginaryPart);
        }
        
        scanner.close();
    }
}