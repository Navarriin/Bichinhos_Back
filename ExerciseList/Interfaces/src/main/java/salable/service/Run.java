package salable.service;

import salable.Salable;

public class Run {
    public static void main(String[] args) {
        Salable service = new Service(94.3);
        int quantity = 30;
        double discount = 22.1;

        double finalPrice = service.calculateTheFinalPrice(quantity);
        System.out.printf("O preço final de %d horas sem desconto, será de R$%.2f!%n", quantity, finalPrice);

        service.applyDiscount(discount);
        double finalPriceWithDiscount = service.calculateTheFinalPrice(quantity);
        System.out.printf("O preço final de %d horas com desconto de R$%.2f, será de R$%.2f!%n", quantity, discount,finalPriceWithDiscount);
    }
}
