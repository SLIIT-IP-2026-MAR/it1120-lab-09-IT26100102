public class IT26100102Lab9Q3 {
    
    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Method to multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    // Method to square a number
    public static int square(int a) {
        return a * a;
    }
    
    public static void main(String[] args) {
        // Calculate i. (3*4 + 5*7)^2
        int part1 = multiply(3, 4); // 3*4
        int part2 = multiply(5, 7); // 5*7
        int sum1 = add(part1, part2); // 3*4 + 5*7
        int result1 = square(sum1); // (3*4 + 5*7)^2
        
        // Calculate ii. (4 + 7)^2 + (8 + 3)^2
        int sum2 = add(4, 7); // 4+7
        int sum3 = add(8, 3); // 8+3
        int square1 = square(sum2); // (4+7)^2
        int square2 = square(sum3); // (8+3)^2
        int result2 = add(square1, square2); // (4+7)^2 + (8+3)^2
        
        System.out.println("Result of (3*4 + 5*7)^2 : " + result1);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 : " + result2);
    }
}
