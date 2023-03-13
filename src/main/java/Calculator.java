import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter operation (+, -, *, /, %, ^, sqr, sqrt): ");
        String operation = input.next();
        double result;
        switch (operation) {
            case "+":

                System.out.print("Enter second number: ");
                double num2 = input.nextDouble();
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case "-":

                System.out.print("Enter second number: ");
                num2 = input.nextDouble();
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case "*":

                System.out.print("Enter second number: ");
                num2 = input.nextDouble();
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case "/":

                System.out.print("Enter second number: ");
                num2 = input.nextDouble();
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    break;
                }
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            case "%":

                System.out.print("Enter second number: ");
                num2 = input.nextDouble();
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    break;
                }
                result = num1 % num2;
                System.out.println(num1 + " % " + num2 + " = " + result);
                break;
            case "^":

                System.out.print("Enter power: ");
                int power = input.nextInt();
                result = Math.pow(num1, power);
                System.out.println(num1 + " ^ " + power + " = " + result);
                break;
            case "sqr":

                result = num1 * num1;
                System.out.println(num1 + " squared = " + result);
                break;
            case "sqrt":

                if (num1 < 0) {
                    System.out.println("Cannot take square root of a negative number.");
                    break;
                }
                result = Math.sqrt(num1);
                System.out.println("Square root of " + num1 + " = " + result);
                break;
            default:
                System.out.println("Invalid operation.");
                break;
        }
        input.close();
    }
}