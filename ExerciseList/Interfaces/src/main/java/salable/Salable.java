package salable;

public interface Salable {
    double calculateTheFinalPrice(int quantity);
    void applyDiscount(double discount);
}
