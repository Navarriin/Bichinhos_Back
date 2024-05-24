package calculable.books;

import calculable.Calculable;

public class Books implements Calculable {

    private final double price;
    private final double discount;

    public Books(double price, String discount) {
        this.price = price;
        this.discount = this.convertStringToDouble(discount);
    }

    private double convertStringToDouble(String discount) {
        String discountReplace = discount.replace("%", "");
        return Double.parseDouble(discountReplace) / 100;
    }

    @Override
    public double calculateFinalPrice() {
        double discount = this.price * this.discount;
        return this.price - discount;
    }
}
