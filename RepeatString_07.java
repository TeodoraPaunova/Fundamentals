package Methods_LAB;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String resultText = repeatString(n, textInput);

        System.out.println(resultText);

    }
    public static String repeatString (int n, String textRepeat) {
        String resultText = "";
        for (int i = 0; i < n; i++) {
            resultText += textRepeat;
        }
        return resultText;
    }
}
