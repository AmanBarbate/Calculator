import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    static void add(int a, int b) {
        System.out.println("Result = " + (a + b));
    }

    static void subtract(int a, int b) {
        System.out.println("Result = " + (a - b));
    }

    static void multiply(int a, int b) {
        System.out.println("Result = " + (a * b));
    }

    static void divide(int a, int b) {
        System.out.println("Result = " + (a / b));
    }

    static void remainder(int a, int b) {
        System.out.println("Result = " + (a % b));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n========== JAVA CALCULATOR ==========");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            try {

                choice = sc.nextInt();

                if (choice == 6) {
                    System.out.println("Thank you for using Calculator!");
                    break;
                }

                if (choice < 1 || choice > 6) {
                    System.out.println("Invalid Choice!");
                    continue;
                }

                System.out.print("Enter first number: ");
                int num1 = sc.nextInt();

                System.out.print("Enter second number: ");
                int num2 = sc.nextInt();

                switch (choice) {

                    case 1:
                        add(num1, num2);
                        break;

                    case 2:
                        subtract(num1, num2);
                        break;

                    case 3:
                        multiply(num1, num2);
                        break;

                    case 4:
                        divide(num1, num2);
                        break;

                    case 5:
                        remainder(num1, num2);
                        break;
                }

            } catch (ArithmeticException e) {

                System.out.println("Error: Cannot divide by zero.");

            } catch (InputMismatchException e) {

                System.out.println("Error: Please enter valid integer numbers.");
                sc.nextLine(); // Clear invalid input

            } finally {

                System.out.println("------------------------------------");
            }

        } while (true);

        sc.close();
    }
}