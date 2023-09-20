package List_LAB;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;

public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Integer> numbersList = Arrays.stream(input.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int size = numbersList.size();
        for (int i = 0; i < size / 2 ; i++) {
            int firstNum = numbersList.get(i);
            int lastNum = numbersList.get(numbersList.size()- 1);

            numbersList.set(i,firstNum + lastNum);
            numbersList.remove(numbersList.size() - 1);

        }
        for (int item: numbersList) {
            System.out.print(item + " ");

        }
    }
}
