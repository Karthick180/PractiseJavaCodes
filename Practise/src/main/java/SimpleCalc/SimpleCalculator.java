package SimpleCalc;

import java.util.Scanner;

class CalcOperations{
    public static int addition(int a, int b){
        return a+b;
    }
    public static int subtraction(int a, int b){
        return a-b;
    }
    public static int multiplication(int a, int b){
        return a*b;
    }
    public static int division(int a, int b){
        return a/b;
    }
}

public class SimpleCalculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        // Selecting operations
        System.out.println("Choose your operations\n 1.add\n 2.sub\n 3.mul\n 4.div");

        System.out.print("Enter your choice: ");
        String choiceOfOperation = scanner.nextLine();

        // Giving input values for operations
        System.out.print("Enter First Number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter Second Number: ");
        int secondNumber = scanner.nextInt();

        switch (choiceOfOperation.toLowerCase()){
            default:
                System.out.println("Enter valid response from the operations correctly");
            case "add":
                System.out.println(CalcOperations.addition(firstNumber,secondNumber));
                break;
            case "sub":
                System.out.println(CalcOperations.subtraction(firstNumber,secondNumber));
                break;
            case "mul":
                System.out.println(CalcOperations.multiplication(firstNumber,secondNumber));
                break;
            case "div": // figured out new problem in catch printing
                try{
                if (secondNumber!=0) {
                    System.out.println(CalcOperations.division(firstNumber, secondNumber));
                }
//                else
//                    System.err.print("Numbers canot be devided by zero");
                }catch(ArithmeticException e){
                    e.printStackTrace();
                }


                break;

        }



    }
}
