package org.navarro.gerenciamento.models;

import java.math.BigDecimal;

public class Product {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;

    // Usado para sequenciar o ID
    private static Long nextId = 1L;

    public Product() {}

    public Product(String name, String description, BigDecimal price) {
        this.id = nextId++;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product {" +
                "id= " + id +
                ", name= '" + name + '\'' +
                ", description= '" + description + '\'' +
                ", price= " + price +
                '}';
    }
}
