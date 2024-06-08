package org.navarro.gerenciamento.models;

import java.time.LocalDateTime;
import java.util.List;

public class SimpleOrder extends StandardOrder{
    private final double freight = 10.50;

    public SimpleOrder(Client client, List<OrderItem> orderItems) {
        super(client, orderItems);
    }

    public double getFreight() {
        return this.freight;
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
