package org.navarro.gerenciamento.models;
import org.navarro.gerenciamento.interfaces.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Store {
    private Long id;
    private List<Product> products;
    private static List<Order> orderList = new ArrayList<>();

    // Usado para sequenciar o ID
    private static Long nextId = 1L;

    public Store() {}

    public Store(List<Product> products) {
        this.id = nextId++;
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public static void createOrder(Order order) {
        orderList.add(order);
    }

    public List<Order> listOrders() {
        return orderList;
    }

    public Order getOrderById(Long id) {
        return orderList.stream()
                .filter(order -> Objects.equals(order.getId(), id))
                .findFirst()
                .orElseThrow(
                        () -> new RuntimeException(String.format("Id %d não existe!", id)));
    }

    public double calculateTheTotalAmount() {
        return orderList.stream().mapToDouble(Order::calculateTotalValue).sum();
    }
}
