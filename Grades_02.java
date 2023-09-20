package Methods_LAB;

import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputGrade = Double.parseDouble(scanner.nextLine());

        printGradeWord(inputGrade);
            }
            public static  void  printGradeWord(double grade) {
        String word = "";
        if (grade >= 2 && grade <= 2.99) {
            word = "Fail";
        } else if (grade >= 3 && grade <= 3.49) {
            word = "Poor";
        } else if (grade >= 3.50 && grade <= 4.49) {
            word = "Good";
        } else if (grade >= 4.50 && grade <= 5.49) {
            word = "Very good";
        } else if (grade >= 5.5) {
            word = "Excellent";
        }
        System.out.println(word);
            }

        }
