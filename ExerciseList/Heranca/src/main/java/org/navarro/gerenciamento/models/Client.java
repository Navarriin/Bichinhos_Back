package org.navarro.gerenciamento.models;


public class Client {
    private Long id;
    private String name;
    private String address;

    // Usado para sequenciar o ID
    private static Long nextId = 1L;

    public Client() {}

    public Client(String name, String address) {
        this.id = nextId++;
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client {" +
                "id= " + id +
                ", name= '" + name + '\'' +
                ", address= '" + address + '\'' +
                '}';
    }
}
