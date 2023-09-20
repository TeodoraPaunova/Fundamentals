package Method_Exercise;

import java.util.Scanner;

public class AddAndsubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. receive 3 integers - input data
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(subtract(firstNumber, secondNumber, thirdNumber));

    }
    public static int sum (int n1, int n2) {
        return n1 + n2;

    }
    public static int subtract (int n1, int n2, int n3) {
        return sum (n1,n2) - n3;
    }
}
