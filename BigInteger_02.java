package ObjectAndClasses_LAB;

import java.math.BigInteger;
import java.util.Scanner;

public class BigInteger_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firsNum = new BigInteger(scanner.nextLine());
        BigInteger secondNum = new BigInteger(scanner.nextLine());

     BigInteger sum = firsNum.add(secondNum);

     System.out.println(sum);
    }
}
