package List_LAB;

import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumber_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List <Double> numbersList = Arrays.stream(input.split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numbersList.size() - 1; i++) {
            double currentNum = numbersList.get(i);
            double nextNum = numbersList.get(i + 1);

            if (currentNum == nextNum) {
                numbersList.set(i, currentNum + nextNum);
                numbersList.remove(i + 1);
                i = -1;

            }
        }

        System.out.println(joinElementsBydelimiter(" ", numbersList));
     }
     public static String joinElementsBydelimiter(String delimiter, List<Double>list ) {
         DecimalFormat fs = new DecimalFormat("0.#");

         String result = "";
         for (double item : list) {
             String numDf = fs.format(item) + delimiter;
             result += numDf;

         }
         return result;
     }
}
