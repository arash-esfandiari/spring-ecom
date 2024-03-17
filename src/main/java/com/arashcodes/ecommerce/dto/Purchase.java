package com.arashcodes.ecommerce.dto;

import com.arashcodes.ecommerce.entity.Address;
import com.arashcodes.ecommerce.entity.Customer;
import com.arashcodes.ecommerce.entity.Order;
import com.arashcodes.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;

    private Address shippingAddress;

    private Address billingAddress;

    private Order order;

    private Set<OrderItem> orderItems;
}
