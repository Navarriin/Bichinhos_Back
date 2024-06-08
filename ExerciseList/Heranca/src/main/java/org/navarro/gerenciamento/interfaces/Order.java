package org.navarro.gerenciamento.interfaces;

import org.navarro.gerenciamento.models.Client;
import org.navarro.gerenciamento.models.OrderItem;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface Order {
    Long getId();
    Client getClient();
    LocalDate getOrderDate();
    List<OrderItem> getItems();
    Double calculateTotalValue();
    void applyDiscount(double discount);
}
