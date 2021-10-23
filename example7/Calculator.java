import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter your second number: ");
        double num2 = input.nextDouble();
        
        System.out.print("Pick an operation (+. -, *, /,  %) ");
        String operation = input.next();

        // Check if dividing by 0 is true
        if (num2 == 0 && operation == "/") {
            System.out.print("Error: Can't divide by 0.");
            System.exit(1);
        }

        // Adding
        if (operation.equals("+")) {
            System.out.print("Your answer is " + (num1 + num2));
        }
        // Subtraction
        else if (operation.equals("-")) {
            System.out.print("Your answer is " + (num1 - num2));
        }
        
        // Multiplaction
        else if (operation.equals("*")) {
            System.out.print("Your answer is " + (num1 * num2));
        }
        // Division
        else if (operation.equals("/")) {
            System.out.print("Your answer is " + (num1 / num2));
        }

        // Modules
        else if (operation.equals("%")) {
            System.out.print("Your answer is " + (num1 % num2));
        }

        // Check if operation is invalid
        else {
            System.out.print("Invalid Operation");
            System.exit(1);
        }
            input.close();
    }
}
