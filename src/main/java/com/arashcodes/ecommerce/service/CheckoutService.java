package com.arashcodes.ecommerce.service;

import com.arashcodes.ecommerce.dto.Purchase;
import com.arashcodes.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
