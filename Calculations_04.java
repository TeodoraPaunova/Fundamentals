package Methods_LAB;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commandInput = scanner.nextLine();
        int firstNumInput = Integer.parseInt(scanner.nextLine());
        int secondNumInput = Integer.parseInt(scanner.nextLine());

        switch (commandInput) {
            case "add" :
                //System.out.println(addNum(firstNumInput, secondNumInput));
                printAdd(firstNumInput, secondNumInput);
                break;
            case "multiply":
                printMultiply(firstNumInput, secondNumInput);
                break;
            case "subtract":
                printSubtract(firstNumInput, secondNumInput);
                break;
            case "divide":
                printDivide(firstNumInput, secondNumInput);
                break;
        }
    }
    public static void printAdd(int firstNum, int secondNum) {
        int result = firstNum + secondNum;

        System.out.println(result);
    }
    public static void printMultiply(int firstNum, int secondNum) {
        int result = firstNum * secondNum;
        System.out.println(result);
    }
    public static void printSubtract (int firstNum, int secondNum) {
        int result = firstNum - secondNum;
        System.out.println(result);
    }
    public static void printDivide (int firstNum, int secondNum) {
        int result = firstNum / secondNum;

        System.out.println(result);
    }
}
