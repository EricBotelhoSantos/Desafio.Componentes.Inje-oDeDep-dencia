package com.desafiodevsuperior.desafio;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desafiodevsuperior.desafio.orgers.Order;
import com.desafiodevsuperior.desafio.services.OrderService;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

    @Autowired
    private OrderService orderService;
    

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------- DESAFIO: COMPONENTES E INJEÇÃO DE DEPENDÊNCIA ----------\n");
        System.out.print("Digite o código do pedido: ");
        int code = sc.nextInt();
        System.out.print("Digite valor básico: ");
        double basic = sc.nextDouble();
        System.out.print("Digite o valor do Disconto: ");
        double discount = sc.nextDouble();
        System.out.print("\n");

        Order order = new Order(code, basic, discount);
        System.out.println("Pedido código: " + order.getCode());
        System.out.println("Valor total: R$" + String.format("%.2f",orderService.total(order)));

        sc.close();
    }

}
