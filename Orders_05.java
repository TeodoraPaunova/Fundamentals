package Methods_LAB;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productInput = scanner.nextLine();
        int quantityInput = Integer.parseInt(scanner.nextLine());

        printTotalSum(productInput, quantityInput);
    }
    public static double getProductPrice(String products) {
        double amount = 0;
        switch (products) {
            case "coffee":
              amount = 1.5;
              break;
            case "water":
                amount = 1.0;
                break;
            case "coke":
                amount = 1.4;
                break;
            case "snacks":
                amount = 2.0;
                break;
        }

        return amount;
    }

    public static double getTotalSum(String product, int quantity) {
       double amount = getProductPrice(product);
       return amount * quantity;
       }
        public static void printTotalSum(String product, int quantity){
        double sum = getTotalSum(product, quantity);
        System.out.printf("%.2f", sum);

        }

    }

