package com.amosribeiro.desafio1.services;

import com.amosribeiro.desafio1.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    ShippingService shippingService;

    public double total(Order order){
        return    order.getBasic() - (order.getBasic() * order.getDiscount())  + shippingService.shipment(order);
    }
}
