package Method_Exercise;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);

        printSymbolInRange(firstSymbol, secondSymbol);
    }
    public static void printSymbolInRange (char firstSymbol, char secondSymbol) {

        if (firstSymbol < secondSymbol) {
            for (char symbol = (char)(firstSymbol + 1); symbol < secondSymbol; symbol++) {
                System.out.print(symbol + " ");
            }

        } else {
            // firstSymbol >= secondSymbol
            // we need to start from secondSymbol
            for (char symbol = (char)(secondSymbol + 1); symbol < firstSymbol; symbol++) {
                System.out.print(symbol + " ");
            }
        }
    }
}
