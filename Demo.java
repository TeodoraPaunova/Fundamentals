package List_LAB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <String > wordsList;wordsList = new ArrayList <>();
        wordsList.add("Veronika");
        wordsList.add("Georgi");
        wordsList.add("Petar");
        wordsList.add("Maria");

        wordsList.remove(2);

        int size = wordsList.size();

        System.out.println(size);

         for (int i = 0; i < wordsList.size(); i++) {
             String word = wordsList.get(i);

             System.out.println(i + " -> " + word);

         }


    }
}
