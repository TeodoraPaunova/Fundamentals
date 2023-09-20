package MidExam_01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> angryCat = Arrays
                .stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int entryPoint = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();

        int left = angryCat.indexOf(entryPoint - 1);
        int right = angryCat.indexOf(entryPoint + 1);

        switch (type) {
            case"cheap":

                break;
            case "expensive":
                break;
        }


    }
}
