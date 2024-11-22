package com.amosribeiro.desafio1;

import com.amosribeiro.desafio1.entities.Order;
import com.amosribeiro.desafio1.services.OrderService;
import com.amosribeiro.desafio1.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Autowired
	OrderService orderService;
	@Autowired
	ShippingService shippingService;

	@Override
	public void run(String... args) throws Exception {
	Order order = new Order(1309, 95.90, 0.00);
		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total: " + orderService.total(order));

	}
}
