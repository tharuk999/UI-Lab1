import java.util.Scanner;
public class Calculator {
    public static int numLoop(Scanner scanner){
        try{
            num1 = scanner.nextInt();
        } catch (Exception e){
            numLoop(scanner);
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input

        int num1=0;
        int num2;
//        while (true) {
//            System.out.println("Enter first number:");
//            try {
//                num1 = scanner.nextInt();
//            } catch (Exception e) {
//                System.out.println("Invalid Input");
//            }
//        }

        /*
        // Source - https://stackoverflow.com/a
        // Posted by polygenelubricants, modified by community. See post 'Timeline' for change history
        // Retrieved 2026-01-13, License - CC BY-SA 3.0

        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please enter a positive number!");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next(); // this is important!
            }
            number = sc.nextInt();
        } while (number <= 0);
        System.out.println("Thank you! Got " + number);

         */
        try{
            num1 = scanner.nextInt();
        }
        catch (Exception e){
            System.out.println("Invalid Input");
            numLoop(scanner);
        }

        while (true) {
            System.out.println("Enter second number:");
            try {
                num2 = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Invalid Input");
                numLoop();
            }
        }

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
