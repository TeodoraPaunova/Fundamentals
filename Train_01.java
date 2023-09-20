package List_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonsList = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());

        int size = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!"end".equals(input)) {
            String[] tokens = input.split("\\s+");
            if (tokens.length == 2) {
                String command = input.split("\\s+")[0];
                int passenger = Integer.parseInt(input.split("\\s+")[1]);
                wagonsList.add(passenger);
            } else {
                int passangersToAdd = Integer.parseInt(tokens[0]);
                for (int i = 0; i <= wagonsList.size() - 1; i++) {
                    int passenger = wagonsList.get(i);
                    if (passangersToAdd + passenger <= size) {
                        wagonsList.add(i, passenger + passangersToAdd);
                        wagonsList.remove(i + 1);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(wagonsList.toString().replaceAll("[\\[\\],]",""));
    }
}