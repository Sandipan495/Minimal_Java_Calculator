import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {   // run until break
            System.out.println("\n=== Minimal Calculator ===");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Goodbye!");
                break; // exit loop
            }

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            double result = Switch (choice) {
                case 1 -> a + b;
                case 2 -> a - b;
                case 3 -> a * b;
                case 4 -> (b == 0) ? Double.NaN : a / b;
                default -> {
                    System.out.println("Invalid choice!");
                    yield Double.NaN;
                }
            };

            if (!Double.isNaN(result)) {
                System.out.println("Result = " + result);
            }
        }

        sc.close();
    }
}