package calculable.product;

import calculable.Calculable;

public class Run {
    public static void main(String[] args) {
        Calculable product = new Product(236.32, 8.2, "11%");

        double valueProduct = product.calculateFinalPrice();
        System.out.printf("O valor final do produto será de R$%.2f!%n", valueProduct);
    }
}
