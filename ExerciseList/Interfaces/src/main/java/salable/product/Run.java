package salable.product;

import salable.Salable;

public class Run {
    public static void main(String[] args) {
        Salable product = new Product(20, 34);

        double discount = 3.20;
        double price = product.calculateTheFinalPrice(5);

        System.out.printf("O Valor de 5 produtos sem desconto é de R$%.2f%n", price);

        product.applyDiscount(discount);
        price = product.calculateTheFinalPrice(5);

        System.out.printf("O Valor de 5 produtos com desconto de R$%.2f cada, é de R$%.2f%n", discount, price);
    }
}
