package CompanyProfit;

import java.util.Scanner;

public class CompanyProfit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalProfits = 0;

        for (int month = 1; month <= 12; month++) {
            System.out.printf("Profit for month %d: ", month);
            double profit = scanner.nextDouble();

            totalProfits += profit;
        }

        System.out.printf("Total profits for 12 months: $%.2f\n", totalProfits);
    }
}
