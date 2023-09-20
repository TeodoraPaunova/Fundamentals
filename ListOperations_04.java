package List_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];
            switch (commandName) {
                case "Add":
                    int numeberToAdd = Integer.parseInt(commandParts[1]);
                    numbers.add(numeberToAdd);
                    break;
                case "Insert":

                    int numberForInsert = Integer.parseInt(commandParts[1]);
                    int indexForInsert = Integer.parseInt(commandParts[2]);
                    if(indexForInsert >= 0 && indexForInsert <= numbers.size()- 1) {
                        numbers.add(indexForInsert, numberForInsert);

                    }else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove" :
                    int indexToRemove = Integer.parseInt(commandParts[1]);
                    if (indexToRemove >= 0 && indexToRemove <= numbers.size()- 1) {
                        numbers.remove(indexToRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String direction = commandParts[1];
                    int count = Integer.parseInt(commandParts[2]);
                    if(direction.equals("left")) {
                        for (int i = 1; i <= count; i++) {
                            int firstElement = numbers.get(0);
                            numbers.remove(0);
                            numbers.add(firstElement);
                        }
                    } else if(direction.equals("right")) {
                        for(int i = 1; i <= count; i++) {
                            int lastElement = numbers.get(numbers.size() - 1);
                            numbers.remove(numbers.size() - 1);
                            numbers.add(0, lastElement);
                        }
                    }
            }
            command = scanner.nextLine();
        }
        for (int number: numbers) {
            System.out.print(number + " ");
        }
    }
}
