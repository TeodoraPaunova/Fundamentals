package Methods_LAB;

import java.util.Scanner;

public class PrintingTriangle_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());

        printTriangle(inputNum);

    }
    public static void printTriangle(int num) {
        for (int i = 1; i <= num; i++) {
            printLine(1,i);
        }
        for (int i = num -1; i >= 1; i--) {
            printLine(1,i);
        }
    }
    public static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

