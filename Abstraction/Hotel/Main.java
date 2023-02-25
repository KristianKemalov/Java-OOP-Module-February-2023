package Abstraction.Hotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        double pricePerDay=Double.parseDouble(input[0]);
        int days=Integer.parseInt(input[1]);
        Season season=Season.valueOf(input[2].toUpperCase());
        DiscountType discountType=DiscountType.valueOf(input[3].toUpperCase());

        System.out.printf("%.2f",PriceCalculator.calculateHolidayPrice(pricePerDay,days,season,discountType));
    }
}
