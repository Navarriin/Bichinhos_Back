package salable.product;

import salable.Salable;

public class Product implements Salable {

    private double price;
    private final int quantity;

    public Product(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public double calculateTheFinalPrice(int quantity) {
        if(quantity > 0) {
            if(quantity <= this.quantity) {
                return price * quantity;
            } else {
                throw new RuntimeException(String.format("Não temos %d itens no estoque!", quantity));
            }
        }
        throw new RuntimeException("Quantidade tem que ser maior que 0");
    }

    @Override
    public void applyDiscount(double discount) {
        if(discount > 0) {
            this.price -= discount;
        } else {
            throw new RuntimeException("Desconto tem que ser maior que R$0,00");
        }
    }
}
