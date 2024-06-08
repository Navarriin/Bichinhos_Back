package org.navarro.gerenciamento.models;

public class OrderItem {
    private Long id;
    private Product product;
    private int quantity;
    private double unitPrice;

    // Usado para sequenciar o ID
    private static Long nextId = 1L;

    public OrderItem(){}

    public OrderItem(Product product, int quantity, double unitPrice) {
        this.id = nextId++;
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "OrderItem {" +
                "id= " + id +
                ", product= " + product +
                ", quantity= " + quantity +
                ", unitPrice= " + unitPrice +
                '}';
    }
}
