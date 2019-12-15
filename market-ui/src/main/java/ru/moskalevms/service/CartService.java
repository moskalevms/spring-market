package ru.moskalevms.service;

import ru.moskalevms.controllers.repr.ProductRepr;
import ru.moskalevms.service.model.LineItem;

import java.math.BigDecimal;
import java.util.List;

public interface CartService {

    void addProductQty(ProductRepr productRepr, String color, String material, int qty);

    void removeProductQty(ProductRepr productRepr, String color, String material, int qty);

    void removeProduct(ProductRepr productRepr, String color, String material);

    List<LineItem> getLineItems();

    BigDecimal getSubTotal();

    void updateCart(LineItem lineItem);
}
