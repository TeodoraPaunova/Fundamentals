package List_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().
                split("\\s+")).
                map(Integer::parseInt).
                collect(Collectors.toList());

        int sum = 0;

        while (numbers.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());

            if(index < 0) {
                int firstElement = numbers.get(0);
                numbers.remove(0);
                sum += firstElement;
                int lastElement = numbers.get(numbers.size()) - 1;
                numbers.add(0, lastElement);
                modifyList(numbers,firstElement);
            } else if (index >= 0 && index <= numbers.size()-1) {
                int removedNumber = numbers.get(index);
                sum += removedNumber;
                numbers.remove(index);
                modifyList(numbers, removedNumber);
                
            }
        }
        System.out.println(sum);
    }

    private static void modifyList(List<Integer> numbers, int removedNumber) {
        for (int index = 0; index <= numbers.size() - 1; index++) {
            int currentElement = numbers.get(index);
            if(currentElement <= removedNumber) {
                currentElement += removedNumber;
            }else {
                currentElement -= removedNumber;
            }
            numbers.set(index,currentElement);
        }

    }
}
