package List_LAB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> numsList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        numsList.remove(0);

        List <String> wordsList = new ArrayList<>(Arrays.asList("Veronika", "Georgi", "Maria"));
        wordsList.remove("Maria");



        System.out.println();

    }
}
