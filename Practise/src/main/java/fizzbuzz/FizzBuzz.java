package fizzbuzz;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Number: ");
       int input = scanner.nextInt();


       if(input%5==0 && input%3==0)
            System.out.println("FIZZBUZZ");
       else if(input%5==0)
           System.out.println("FIZZ");
       else if (input%3==0)
           System.out.println("BUZZ");
       else
           System.out.println(input);


    }
}
