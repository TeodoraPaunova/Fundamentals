package TextProcessing_Exercise;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

          String path = scanner.nextLine();
          String[] parts = path.split("\\\\");
          String fullFileName = parts[parts.length-1];

          String name = fullFileName.split("\\.")[0];
          String extension = fullFileName.split("\\.")[1];

          System.out.println("File name: " + name);
          System.out.println("File extension: " + extension);

    }
}
