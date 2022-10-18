package primenumber;


import java.util.Scanner;

public class FindPrime {
    public static boolean isPrime(int number){
        if(number<2)
            return false;
        for(int i=2;i<number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the max num of your range to find the prime number upto that: ");
        int inputNumber = scanner.nextInt();
        int counter = 0;
        for (int i=1;i<=inputNumber;i++){
            if(isPrime(i)) {
                System.out.print(i + " ");
                counter++;
            }
        }
        System.out.println("\nThe amount of prime numbers that present inside "+inputNumber+" is: "+counter);
    }
}
