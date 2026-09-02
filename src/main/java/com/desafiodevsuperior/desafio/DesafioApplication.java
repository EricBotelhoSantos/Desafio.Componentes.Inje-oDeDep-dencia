package com.desafiodevsuperior.desafio;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {
    

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o código do pedido: ");
        int code = sc.nextInt();
    }

}
