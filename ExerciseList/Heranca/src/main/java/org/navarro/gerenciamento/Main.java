package org.navarro.gerenciamento;

import org.navarro.gerenciamento.interfaces.Order;
import org.navarro.gerenciamento.models.*;
import org.navarro.gerenciamento.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Iniciando metodos de forma clean usando metodos staticos.
        Product product = Utils.initProduct();
        Client client = Utils.initClient();
        Store store = Utils.initStore();
        OrderItem orderItem1 = Utils.initOrderItem();
        OrderItem orderItem2 = Utils.initOrderItem();

        // Adicionando produtos a loja.
        store.addProduct(product);
        store.addProduct(product);

        // Cria um pedido simples e um expresso
        Order simpleOrder = new SimpleOrder(client, new ArrayList<>(List.of(orderItem1)));
        Order expressOrder = new ExpressOrder(client, new ArrayList<>(List.of(orderItem2)), 12);

        // Calcula o valor total de cada pedido e aplica descontos.
        System.out.println("Valores sem desconto: ");
        System.out.println(simpleOrder.calculateTotalValue());
        System.out.println(expressOrder.calculateTotalValue());

        // Aplicando descontos
        simpleOrder.applyDiscount(5);
        expressOrder.applyDiscount(10);
        System.out.println("------------------------------");
        System.out.println("Valores com desconto: ");
        System.out.println(simpleOrder.calculateTotalValue());
        System.out.println(expressOrder.calculateTotalValue());

        // Informações sobre os pedidos
        System.out.println("------------------------------");
        System.out.println("Informações sobre os pedidos");
        System.out.println(simpleOrder);
        System.out.println(expressOrder);

        // Faturamento total da loja
        System.out.println("------------------------------");
        System.out.println("Faturamento total da loja: ");
        System.out.println(store.calculateTheTotalAmount());
    }
}