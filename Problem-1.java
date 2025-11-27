import java.util.Scanner;

public class Problem1 {

    static class Calculator {   //this is the inner class for providing the business logic instead of taking seperate class im taking inner class in the same file for better readabbility
       
        public double add(double a, double b) { return a + b; }
        public double subtract(double a, double b) { return a - b; }
        public double multiply(double a, double b) { return a * b; }
        public double divide(double a, double b) {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return a / b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("=== Simple Calculator ===");

        while (true) {//im taking while loop for using the calculator again and again without exising
            System.out.println("\n1. Add  2. Subtract  3. Multiply  4. Divide  5. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();  //here instead of taking input as string im taking integer to avoid the input misamatches so we can select any one of the above listed options

            if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.print("Enter first number: ");
            double a = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();

            double result = 0;

            switch (choice) {
                case 1: result = calculator.add(a, b); break;
                case 2: result = calculator.subtract(a, b); break;
                case 3: result = calculator.multiply(a, b); break;
                case 4: result = calculator.divide(a, b); break;
                default:
                    System.out.println("Invalid option.");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
