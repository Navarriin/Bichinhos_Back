package salable.service;

import salable.Salable;

public class Service implements Salable {

    private double pricePerHour;

    public Service(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    @Override
    public double calculateTheFinalPrice(int quantity) {
        if (quantity > 0) {
            return this.pricePerHour * (double) quantity;
        }
        throw new RuntimeException("A quantidade de horas precisa ser maior que 0!");
    }

    @Override
    public void applyDiscount(double discount) {
        if(discount > 0) {
            this.pricePerHour -= discount;
        } else {
            throw new RuntimeException("O valor do desconto precisa ser maior que R$0,00!");
        }
    }
}
