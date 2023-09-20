package Methods_LAB;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(multyply(num));

    }
    public static  int multyply(int num) {
        return  evenSum(num) * oddSum(num);

    }
    public static int evenSum(int num) {
        String intToString = Integer.toString(num);

        int [] arr = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();


        int sum = 0;
        for (int n : arr) {
            if (n % 2 == 0) {
                sum += n;

            }
        }
        return sum;

    }
    public static int oddSum(int num) {
        String intToString = Integer.toString(num);

        int [] arr = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int n :arr) {
            if(n % 2 != 0){
                sum += n;
            }
        }
        return  sum;
    }
}
