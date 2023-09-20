package Method_Exercise;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

         printMiddleCharacters(text);
    }
    //method, print middle char symbol
    public  static void printMiddleCharacters (String text) {
        //int length = text.length;
        // if text have odd length = 1 middle symbol
        if (text.length() % 2 != 0) {
           int indexOfMiddleCharacter = text.length() / 2 ;
           System.out.println(text.charAt(indexOfMiddleCharacter));

        }else {
            // if text have even length = 2 middle symbol
            //"someText" - 8 symbols -> eT (index :3 and 4)
            //"dogs" - 4 symbols -> og ( index: 1 and 2)
            int indexFirstMiddleCharacter = text.length() / 2 - 1;
            int indexSecondMiddleCharacter = text.length() / 2;


            System.out.print(text.charAt(indexFirstMiddleCharacter));
            System.out.print(text.charAt(indexSecondMiddleCharacter));
        }

    }
}
