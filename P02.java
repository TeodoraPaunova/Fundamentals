package MidExam_01;

import java.util.*;
import java.util.stream.Collectors;

public class P02 {

    public static void replaceFirstOccurrence(List<Integer> list, int oldValue, int newValue) {
        int index = list.indexOf(oldValue);
        if (index != -1) {
            list.set(index, newValue);
        }
    }

    public static List<Integer> removeSmallerNumbers(List<Integer> numbers, int threshold) {
        return numbers.stream()
                .filter(num -> num >= threshold)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays
                .stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();

      while (!input.equals("Finish")) {
          String[] commandArr = input.split(" ");
          String command = commandArr[0];
          input = scanner.nextLine();

          switch (command) {
              case "Add":
                  int numToAdd = Integer.parseInt(commandArr[1]);
                  numbersList.add(numToAdd);
                  break;
              case "Remove":
                  int numToRemove = Integer.parseInt(commandArr[1]);
                  numbersList.remove(Integer.valueOf(numToRemove));
                  break;
              case "Replace":
                  int numToReplace = Integer.parseInt(commandArr[1]);
                  int numToReplacement = Integer.parseInt(commandArr[2]);
                  replaceFirstOccurrence(numbersList, numToReplace, numToReplacement);
                  break;
              case "Collapse":
                  int numCollapse = Integer.parseInt(commandArr[1]);
                  numbersList = removeSmallerNumbers(numbersList, numCollapse);
                  break;
          }
      }
      System.out.println(numbersList.toString().replaceAll("[\\[\\],]",""));

    }
}

