package org.navarro.gerenciamento.models;

import org.navarro.gerenciamento.interfaces.Order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StandardOrder implements Order {
    private Long id;
    private Client client;
    private LocalDate date;
    private List<OrderItem> orderItems;

    // Usado para sequenciar o ID
    private static Long nextId = 1L;

    public StandardOrder() {}

    public StandardOrder(Client client, List<OrderItem> orderItems) {
        this.id = nextId++;
        this.client = client;
        this.orderItems = new ArrayList<>(orderItems);
        this.date = LocalDate.now();

        Store.createOrder(this);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public Client getClient() {
        return this.client;
    }

    @Override
    public LocalDate getOrderDate() {
        return this.date;
    }

    @Override
    public List<OrderItem> getItems() {
        return this.orderItems;
    }

    @Override
    public Double calculateTotalValue() {
        return this.orderItems.stream()
                .peek(item -> {
                    this.validateItemsAvailability(item);
                    item.setQuantity(item.getQuantity() - 1);
                })
                .mapToDouble(OrderItem::getUnitPrice)
                .sum();
    }

    @Override
    public void applyDiscount(double discount) {
        this.orderItems.forEach(item -> item.setUnitPrice(item.getUnitPrice() - discount));
    }

    protected void validateItemsAvailability(OrderItem item){
        if(item.getQuantity() < 1) {
            throw new RuntimeException(
                    String.format("Item %s não esta disponivel!", item.getProduct().getName()));
        }
    }

    @Override
    public String toString() {
        return "Order {" +
                "id= " + id +
                ", client= " + client +
                ", date= " + date +
                ", orderItems= " + orderItems +
                '}';
    }
}

