package Method_Exercise;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();
        //"text .toLowerCase -> make all letters in small letter.

        printCountVowels(text);
    }

    // метод, кйто отпечатва броя на гласните букви- small or big
    public static void printCountVowels(String text) {
        int count = 0;  // броя на гласните букви
        for (char symbol : text.toCharArray()) {
            // гласни букви - a,e,i,o,u
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}

