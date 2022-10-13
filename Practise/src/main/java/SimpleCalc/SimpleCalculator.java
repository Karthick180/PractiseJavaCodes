package SimpleCalc;

import java.util.Scanner;

class CalcOperations{

    protected final double addition(double a, double b){
        return a+b;
    }

    protected final double subtraction(double a, double b){
        return a-b;
    }

    protected final double multiplication(double a, double b){
        return a*b;
    }

    protected final double division(double a, double b){
        return a/b;
    }
}

public class SimpleCalculator {
    public static void main(String[] args) {
        CalcOperations operations = new CalcOperations();

        double firstNumber;
        double secondNumber;
        String repeatOperation;
        Scanner scanner = new Scanner(System.in);


            // Selecting operations
            System.out.println("Choose your operations\n 1.add\n 2.sub\n 3.mul\n 4.div");

            System.out.print("Enter your choice: ");
            String choiceOfOperation = scanner.nextLine();

            do {
                // Giving input values for operations
                System.out.print("Enter First Number: ");
                firstNumber = scanner.nextFloat();

                System.out.print("Enter Second Number: ");
                secondNumber = scanner.nextFloat();

                switch (choiceOfOperation.toLowerCase()) {
                    default:
                        System.out.println("Enter valid response from the operations correctly");
                    case "add":
                        System.out.println(operations.addition(firstNumber, secondNumber));
                        break;
                    case "sub":
                        System.out.println(operations.subtraction(firstNumber, secondNumber));
                        break;
                    case "mul":
                        System.out.println(operations.multiplication(firstNumber,  secondNumber));
                        break;
                    case "div": // figured out new problem in catch printing
                        try {
                            if(secondNumber!=0)
                                System.out.println(operations.division(firstNumber, secondNumber));
                            else
                                System.out.println("The dividing number must be greater than \"zero\"");
                        } catch (ArithmeticException e) {
                            System.err.println(" ");
                        }
                        break;

                }
                System.out.print("Do you want to repeat again [y/n]");
                repeatOperation = scanner.next();
            }while(repeatOperation.equalsIgnoreCase("y"));

        System.err.println("\"Thank you for using me sir\", Have a great day :) \nbye");

    }
}
