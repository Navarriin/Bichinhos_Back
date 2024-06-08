package org.navarro.gerenciamento.utils;

import org.navarro.gerenciamento.interfaces.Order;
import org.navarro.gerenciamento.models.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static Product initProduct() {
        return new Product("Produto 1", "Descrição do produto 1!", new BigDecimal(10));
    }

    public static Client initClient() {
        return new Client("Gabriel", "Campinas-SP");
    }

    public static Store initStore() {
        return new Store(new ArrayList<>(List.of(initProduct())));
    }

    public static OrderItem initOrderItem() {
        return new OrderItem(initProduct(), 5, 23);
    }

    public static Order initOrder() {
        return new StandardOrder(initClient(), new ArrayList<>(List.of(initOrderItem())));
    }
}
