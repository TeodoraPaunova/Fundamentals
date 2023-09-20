package TextProcessing_LAB;

import java.util.Scanner;

public class DigitsLettersAndOther_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        StringBuilder other = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder digitSb = new StringBuilder();

        for(int i = 0; i < inputLine.length(); i++) {
            char symbol = inputLine.charAt(i);

            if(Character.isDigit(symbol)) {
                digitSb.append(symbol);

            }else if(Character.isLetter(symbol)) {
                letters.append(symbol);

            }else {
                other.append(symbol);
            }
        }
        System.out.println(digitSb);
        System.out.println(letters);
        System.out.println(other);
    }
}
