package Abstraction.Hotel;

public class PriceCalculator {

    public static double calculateHolidayPrice(double pricePerDay, int days, Season season, DiscountType discountType) {
        double price = pricePerDay * days;
        price = price * season.getMultiplyCoefficient();

        price = price - price * discountType.getPercent() / 100;
        return price;

    }

}
