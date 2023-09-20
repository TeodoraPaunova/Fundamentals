package Method_Exercise;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {
            if (isSumOfDigitsISDivisionBy8(number) && checkContainsOddDigit(number)) {
                //top number
                System.out.println(number);
            }
        }
    }
    //method , check sum of numbers  / 8 -> we did with method isSumOfDigitsISDivisionBy8
    // true of method -> method checkContainsOddDigit
    // false = sum is not / 8
    public static boolean isSumOfDigitsISDivisionBy8 (int number) {
        //1. sum of numbers
        int sum = 0;
        while(number >0) {
            int lastDigit = number % 10; // lastDigit take
            sum += lastDigit;   // sum of lastDigit
            number = number / 10; // take of lastDigits

        }
        //2. if sum /8
        // return sum % 8 == 0; - to not use if loop
        if (sum % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }
    // method for odd number
    // true if we have just 1 odd number
    // false if we don't have 1 odd number
    public static boolean checkContainsOddDigit (int number) {
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) { // odd number = true
                return true;
            }else {  // even number = false
               number = number / 10;
            }
        }
        return false;
    }
}
