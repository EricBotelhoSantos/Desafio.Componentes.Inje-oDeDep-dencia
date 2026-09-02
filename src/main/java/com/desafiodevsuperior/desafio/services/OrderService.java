package com.desafiodevsuperior.desafio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafiodevsuperior.desafio.orgers.Order;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;
    
    public double total(Order order) {
        return order.getBasic() - (order.getBasic() * order.getDiscount()) + shippingService.shipment(order);
    }
}
