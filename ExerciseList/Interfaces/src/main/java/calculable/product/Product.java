package calculable.product;

import calculable.Calculable;

public class Product implements Calculable {

    private final double price;
    private final double freight;
    private final double taxRate;

    public Product(double price, double freight, String taxRate) {
        this.price = price;
        this.freight = freight;
        this.taxRate = this.convertStringToDouble(taxRate);
    }

    private double convertStringToDouble(String taxRate) {
        String taxRateReplace = taxRate.replace("%", "");
        return Double.parseDouble(taxRateReplace) / 100;
    }

    private double calculateValueOfImpost(double price, double taxRate) {
        return price * taxRate;
    }

    @Override
    public double calculateFinalPrice() {
        double valueOfImpost = calculateValueOfImpost(this.price, this.taxRate);
        return (this.price + valueOfImpost) + this.freight;
    }
}
