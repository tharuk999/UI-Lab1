import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt(); //scans 1st input
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt(); //scans 2nd input

        // Operations
        int sum = num1 + num2; //calculate sum of 2 numbers
        int difference = num1 - num2; //calculate difference of 2 numbers
        int product = num1 * num2; //calculate product of 2 numbers
        String quotient = (num2 != 0) ? String.valueOf(num1 / num2) : "undefined"; //calculate quotient of 2 numbers with error handling if num2==0

        // Output results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
