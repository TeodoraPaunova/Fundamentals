package Method_Exercise;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        //1. factorial on first Number
        long factFirstNumber = calculateFactorial(firstNumber);

        //2. factorial on second Number
        long factSecondNumber = calculateFactorial(secondNumber);

        //f1 / f2 -> %.2f = double number
        double result = factFirstNumber * 1.0 / factSecondNumber;

        System.out.printf("%.2f", result);
    }
    // method return result of factorial on numbers
    public  static long calculateFactorial (int number) {
        //number = 7
        // 7! = 1*2*3*4*5*6*7
        long fact = 1;  // factorial
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
