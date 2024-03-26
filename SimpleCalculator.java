import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(".....................|| Welcome to Simple Calculator! ||..............................");
        System.out.println("  ");
        System.out.println("Choose an operation(+,-,*,/,%,^):");
        System.out.println("1. Add (+)");
        System.out.println("2. Sub (-)");
        System.out.println("3. Mul (*)");
        System.out.println("4. Div (/)");
        System.out.println("5. Modu (%)");
        System.out.println("6. Power (^)");
        System.out.println("  ");
        System.out.println("......................................................................................");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                addition();
                break;
            case 2:
                subtraction();
                break;
            case 3:
                multiplication();
                break;
            case 4:
                division();
                break;
            case 5:
                modulo();
                break;
            case 6:
                power();
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    public static void addition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number_1:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter two number_2:");
        double num2 = scanner.nextDouble();
        System.out.println("Result: " + (num1 + num2));
    }

    public static void subtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number_1:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter two number_2:");
        double num2 = scanner.nextDouble();
        System.out.println("Result: " + (num1 - num2));
    }

    public static void multiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number_1:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter two number_2:");
        double num2 = scanner.nextDouble();
        System.out.println("Result: " + (num1 * num2));
    }

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number_1:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter two number_2:");
        double num2 = scanner.nextDouble();
        if (num2 != 0) {
            System.out.println("Result: " + (num1 / num2));
        } else {
            System.out.println("Error! Division by zero.");
        }
    }

    public static void modulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number_1:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter two number_2:");
        double num2 = scanner.nextDouble();
        if (num2 != 0) {
            System.out.println("Result: " + (num1 % num2));
        } else {
            System.out.println("Error! Modulo by zero.");
        }
    }

    public static void power() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number_1:");
        double base = scanner.nextDouble();
        System.out.println("Enter two number_2:");
        double exponent = scanner.nextDouble();
        System.out.println("Result: " + Math.pow(base, exponent));
    }
}
