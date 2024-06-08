package org.navarro.gerenciamento.models;

import java.time.LocalDateTime;
import java.util.List;

public class ExpressOrder extends StandardOrder{
    private double freight;

    public ExpressOrder() {}

    public ExpressOrder(Client client, List<OrderItem> orderItems, double freight) {
        super(client, orderItems);
        this.freight = freight;
    }

    public double getFreight(){
        return this.freight;
    }

    public void setFreight(double freight) {
        this.freight = freight;
    }

    @Override
    public Double calculateTotalValue() {
        return super.getItems().stream()
                .peek(item -> {
                    super.validateItemsAvailability(item);
                    item.setQuantity(item.getQuantity() - 1);
                })
                .mapToDouble(OrderItem::getUnitPrice)
                .sum() + this.freight;
    }
}
